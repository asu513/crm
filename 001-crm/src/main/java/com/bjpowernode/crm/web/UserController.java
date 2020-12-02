package com.bjpowernode.crm.web;

import com.bjpowernode.crm.model.Auth;
import com.bjpowernode.crm.model.Role;
import com.bjpowernode.crm.model.User;
import com.bjpowernode.crm.service.*;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：阿苏
 * 日期：2020/12/01/18:57
 * 描述：
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    AuthService authService;
    @Autowired
    RoleService roleService;
    @Autowired
    UserAuthService userAuthService;
    @Autowired
    UserRoleService userRoleService;

    //员工管理
    @RequestMapping("/user/list")
    public String userList(Model model) {
        //查询所有员工
        List<User> userList = userService.queryAllUsers();
        model.addAttribute("userList",userList);
        return "/user/list";
    }

    //跳转员工添加页面
    @RequestMapping("/user/add")
    public String edit(Model model) {
        User user = new User();
        model.addAttribute("user",user);
        return "/user/edit";
    }

    //员工添加
    @RequestMapping("/user/save")
    public String save(String userName,String userPwd,Model model) {
        User user = new User();
        user.setUserName(userName);
        user.setUserPwd(userPwd);
        Integer result = userService.addUser(user);
        if (!ObjectUtils.allNotNull(result)) {
            model.addAttribute("error","系统异常，请稍后再试");
        }
        return "redirect:/user/list";
    }

    //跳转员工修改页面
    @RequestMapping("/user/update")
    public String update(int userId,Model model) {
        //通过id查询
        User user = userService.queryUserById(userId);
        model.addAttribute("user",user);
        return "/user/edit";
    }

    //员工修改
    @RequestMapping("/user/saveUpdate")
    public String saveUpdate(User user) {
        userService.megerUser(user);
        return "redirect:/user/list";
    }

    //员工授权
    @RequestMapping("/user/auth")
    public String userAuth(int userId, Model model) {
        //通过userId查询员工
        User user = userService.queryUserById(userId);

        //查询所有权限
        List<Auth> authList = authService.list();
        model.addAttribute("authList",authList);
        //查询所有职务
        List<Role> roleList = roleService.list();
        model.addAttribute("roleList",roleList);

        //通过id查询所拥有的权限
        List<Auth> authList1 = authService.queryAuthByUserId(userId);
        List<Integer> authIds = new ArrayList<>();
        //拥有的权限遍历出来
        for (Auth auth :authList1){
            //得到id放入数组中
            authIds.add(auth.getAuthId());
        }
        user.setAuthIds(authIds);

        //通过id查询所拥有的职务
        List<Role> roleList1 = roleService.queryRoleByUserId(userId);
        List<Integer> roleIds = new ArrayList<>();
        //拥有的权限遍历出来
        for (Role role : roleList1){
            //得到id放入数组中
            roleIds.add(role.getRoleId());
        }
        user.setRoleIds(roleIds);

        model.addAttribute("user", user);
        return "/user/auth";
    }

    //权限保存
    @RequestMapping("/user/saveAuth")
    public String saveAuth(User user,int[] authIds,int[] roleIds){
        //修改用户信息
        userService.megerUser(user);

        //修改用户权限
        userAuthService.megerAuthByUserId(user.getUserId(),authIds);
        //修改用户角色
        userRoleService.megerRoleByUserId(user.getUserId(), roleIds);

        return "redirect:/user/list";
    }
}
