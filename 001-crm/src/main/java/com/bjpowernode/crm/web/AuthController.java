package com.bjpowernode.crm.web;

import com.bjpowernode.crm.model.Auth;
import com.bjpowernode.crm.model.User;
import com.bjpowernode.crm.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 作者：阿苏
 * 日期：2020/12/02/9:27
 * 描述：权限控制层
 */
@Controller
public class AuthController {

    @Autowired
    AuthService authService;

    //权限管理列表
    @RequestMapping("/auth/list")
    public String authList(Model model) {
        //查询所有权限
        List<Auth> authList = authService.list();
        model.addAttribute("authList",authList);
        return "/auth/list";
    }

    //跳转新增权限页面
    @RequestMapping("/auth/add")
    public String authAdd(Auth auth) {
        return "/auth/edit";
    }

    //跳转新增权限页面
    @RequestMapping("/auth/save")
    public String authSaveAdd(Auth auth) {
        authService.add(auth);
        return "redirect:/auth/list";
    }

    //跳转修改权限页面
    @RequestMapping("/auth/update")
    public String authEdit(int authId,Model model) {
        //通过权限id查询权限
        Auth auth = authService.queryAuthByAuthId(authId);
        model.addAttribute("auth",auth);
        return "/auth/edit";
    }

    //修改权限
    @RequestMapping("/auth/saveUpdate")
    public String saveUpdate(Auth auth) {
        //通过权限id查询权限
        authService.modifyAuth(auth);
        return "redirect:/auth/list";
    }
}
