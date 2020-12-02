package com.bjpowernode.crm.service;

/**
 * 作者：阿苏
 * 日期：2020/12/02/10:16
 * 描述：角色权限表
 */
public interface RoleAuthService {

     /**
      * @Author: 阿苏
      * @Date: 2020/12/2
      * @Description:向角色权限表写值
      */
    void save(Integer roleId, int[] authIds);

}
