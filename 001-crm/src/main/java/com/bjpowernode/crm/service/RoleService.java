package com.bjpowernode.crm.service;

import com.bjpowernode.crm.model.Role;

import java.util.List;

/**
 * 作者：阿苏
 * 日期：2020/12/01/21:34
 * 描述：职务接口类
 */
public interface RoleService {
     /**
      * @Author: 阿苏
      * @Date: 2020/12/1
      * @Description:查询所有职务
      */
    List<Role> list();

     /**
      * @Author: 阿苏
      * @Date: 2020/12/1
      * @Description:通过id查询所拥有的职务
      */
    List<Role> queryRoleByUserId(int userId);

     /**
      * @Author: 阿苏
      * @Date: 2020/12/2
      * @Description:新增角色
      */
    void save(Role role);

     /**
      * @Author: 阿苏
      * @Date: 2020/12/2
      * @Description:通过主键查询角色
      */
    Role queryRoleByRoleId(int roleId);

     /**
      * @Author: 阿苏
      * @Date: 2020/12/2
      * @Description:更新角色信息
      */
    void modify(Role role);
}
