package com.bjpowernode.crm.service;

import com.bjpowernode.crm.model.Auth;

import java.util.List;

/**
 * 作者：阿苏
 * 日期：2020/12/01/21:12
 * 描述：权限表
 */
public interface AuthService {

     /**
      * @Author: 阿苏
      * @Date: 2020/12/1
      * @Description:通过id查询所拥有的权限
      */
    List<Auth> queryAuthByUserId(int userId);

     /**
      * @Author: 阿苏
      * @Date: 2020/12/1
      * @Description:查询所有权限
      */
    List<Auth> list();

     /**
      * @Author: 阿苏
      * @Date: 2020/12/2
      * @Description:添加权限
      */
    void add(Auth auth);

     /**
      * @Author: 阿苏
      * @Date: 2020/12/2
      * @Description:通过主键查询
      */
    Auth queryAuthByAuthId(int authId);

     /**
      * @Author: 阿苏
      * @Date: 2020/12/2
      * @Description:修改权限
      */
    void modifyAuth(Auth auth);

     /**
      * @Author: 阿苏
      * @Date: 2020/12/2
      * @Description:通过角色id查询权限
      */
    List<Auth> queryAuthByRoleId(int roleId);


}
