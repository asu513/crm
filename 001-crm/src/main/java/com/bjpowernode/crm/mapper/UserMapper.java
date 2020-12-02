package com.bjpowernode.crm.mapper;

import com.bjpowernode.crm.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //查询所有员工
    List<User> queryAllUsers();

    //验证账号和密码
    User queryUserByNameAndPwd(@Param("userName") String userName,@Param("userPwd") String userPwd);

}