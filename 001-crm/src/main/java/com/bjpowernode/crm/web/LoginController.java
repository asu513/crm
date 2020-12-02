package com.bjpowernode.crm.web;

import com.bjpowernode.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作者：阿苏
 * 日期：2020/12/01/16:04
 * 描述：
 */
@Controller
public class LoginController {



    @RequestMapping("/auth/login")
    public String login() {
        return "login";
    }

}
