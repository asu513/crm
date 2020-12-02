package com.bjpowernode.crm.web;

import com.bjpowernode.crm.model.User;
import com.bjpowernode.crm.service.UserService;
import com.bjpowernode.crm.util.Constants;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 作者：阿苏
 * 日期：2020/12/01/16:32
 * 描述：
 */
@Controller
public class IndexController {

    @Autowired
    UserService userService;

    //首页
    @RequestMapping("/auth/index")
    public String index(String userName, String userPwd,
                        HttpServletRequest request) {
        //验证账号和密码
        User user = userService.queryUserByNameAndPwd(userName, userPwd);
        if (!ObjectUtils.allNotNull(user)) {
            return "loginError";
        }
        request.getSession().setAttribute(Constants.LOGIN_USER,"user");
        return "index";
    }

    //工作台
    @RequestMapping("/right")
    public String right() {
        return "right";
    }

    //市场活动
    @RequestMapping("/activity/list")
    public String activityList() {
        return "/activity/list";
    }

}
