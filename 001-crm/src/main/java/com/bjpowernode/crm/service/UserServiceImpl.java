package com.bjpowernode.crm.service;

import com.bjpowernode.crm.mapper.UserMapper;
import com.bjpowernode.crm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者：阿苏
 * 日期：2020/12/01/18:59
 * 描述：员工实现类
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    //查询所有员工
    @Override
    public List queryAllUsers() {
        return userMapper.queryAllUsers();
    }

    //验证账号和密码
    @Override
    public User queryUserByNameAndPwd(String userName, String userPwd) {
        return userMapper.queryUserByNameAndPwd(userName, userPwd);
    }

    //添加用户
    @Override
    public Integer addUser(User user) {
        return userMapper.insertSelective(user);
    }

    //通过id查询
    @Override
    public User queryUserById(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    //用户修改
    @Override
    public void megerUser(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

}
