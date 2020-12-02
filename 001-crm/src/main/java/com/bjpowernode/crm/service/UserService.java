package com.bjpowernode.crm.service;

import com.bjpowernode.crm.model.User;

import java.util.List;

/**
 * 作者：阿苏
 * 日期：2020/12/01/18:58
 * 描述：员工接口类
 */
public interface UserService {

     /**
      * @Author: 阿苏
      * @Date: 2020/12/1
      * @Description:查询所有员工
      */
    List<User> queryAllUsers();

     /**
      * @Author: 阿苏
      * @Date: 2020/12/1
      * @Description:验证账号和密码
      */
    User queryUserByNameAndPwd(String userName, String userPwd);

     /**
      * @Author: 阿苏
      * @Date: 2020/12/1
      * @Description:员工添加
      */
    Integer addUser(User user);

     /**
      * @Author: 阿苏
      * @Date: 2020/12/1
      * @Description:通过id查询
      */
    User queryUserById(Integer userId);

     /**
      * @Author: 阿苏
      * @Date: 2020/12/1
      * @Description:用户修改
      */
    void megerUser(User user);


}
