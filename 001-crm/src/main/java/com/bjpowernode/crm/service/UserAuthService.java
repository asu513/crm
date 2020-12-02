package com.bjpowernode.crm.service;

/**
 * 作者：阿苏
 * 日期：2020/12/02/11:59
 * 描述：用户权限表
 */
public interface UserAuthService {

    /**
      * @Author: 阿苏
      * @Date: 2020/12/2
      * @Description:修改用户权限
      */
    void megerAuthByUserId(int userId, int[] authIds);
}
