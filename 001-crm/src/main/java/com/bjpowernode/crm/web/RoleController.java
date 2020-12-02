package com.bjpowernode.crm.web;

import com.bjpowernode.crm.model.Auth;
import com.bjpowernode.crm.model.Role;
import com.bjpowernode.crm.service.AuthService;
import com.bjpowernode.crm.service.RoleAuthService;
import com.bjpowernode.crm.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 作者：阿苏
 * 日期：2020/12/02/10:00
 * 描述：角色控制层
 */
@Controller
public class RoleController {

    @Autowired
    RoleService roleService;
    @Autowired
    AuthService authService;
    @Autowired
    RoleAuthService roleAuthService;

    //角色管理
    @RequestMapping("/role/list")
    List<Role> list() {
        //查询所有角色
        return roleService.list();
    }

    //跳转角色新增页面
    @RequestMapping("/role/add")
    public String roleAdd(Role role, Map<String, Object> map) {
        //查询所有权限
        List<Auth> authList = authService.list();
        map.put("authList",authList);
        map.put("role",role);
        return "/role/edit";
    }

    //角色新增
    @RequestMapping("/role/save")
    public String roleSave(Role role, int[] authIds) {
        //向角色表写值
        roleService.save(role);
        //向角色权限表写值
        roleAuthService.save(role.getRoleId(),authIds);
        return "redirect:/role/list";
    }

    //跳转角色编辑页面
    @RequestMapping("/role/update")
    public String roleUpdate(int roleId, Map<String, Object> map) {
        //通过主键查询角色
        Role role = roleService.queryRoleByRoleId(roleId);
        //查询所有权限
        map.put("authList",authService.list());
        //通过角色id查询权限
        List<Auth> authList1 = authService.queryAuthByRoleId(roleId);
        ArrayList<Integer> authIds = new ArrayList<>();
        for (Auth auth:authList1){
            authIds.add(auth.getAuthId());
        }
        role.setAuthIds(authIds);

        map.put("role",role);
        return "/role/edit";
    }

    //角色编辑
    @RequestMapping("/role/saveUpdate")
    public String roleSaveUpdate(Role role,int[] authIds, Map<String, Object> map) {
        //更新角色信息
        roleService.modify(role);
        //向角色权限表重新写值
        roleAuthService.save(role.getRoleId(),authIds);

        return "redirect:/role/list";
    }
}
