package com.bjpowernode.crm.service;

import com.bjpowernode.crm.mapper.UserAuthMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 作者：阿苏
 * 日期：2020/12/02/14:30
 * 描述：用户权限实现类
 */
@Controller
public class UserAuthServiceImpl implements UserAuthService {

    @Autowired
    UserAuthMapper userAuthMapper;

    //修改用户权限
    @Override
    public void megerAuthByUserId(int userId, int[] authIds) {
        //删除旧权限
        userAuthMapper.deleteByUserId(userId);
        //写入新权限
        if(authIds != null && authIds.length > 0) {
            userAuthMapper.insertBatch(userId, authIds);
        }
    }
}
