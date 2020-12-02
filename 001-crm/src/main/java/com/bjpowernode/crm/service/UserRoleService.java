package com.bjpowernode.crm.service;

/**
 * 作者：阿苏
 * 日期：2020/12/02/14:45
 * 描述：用户角色表
 */
public interface UserRoleService {
     /**
      * @Author: 阿苏
      * @Date: 2020/12/2
      * @Description:修改用户角色
      */
    void megerRoleByUserId(int userId, int[] roleIds);
}
