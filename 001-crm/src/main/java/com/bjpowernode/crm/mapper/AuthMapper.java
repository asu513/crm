package com.bjpowernode.crm.mapper;

import com.bjpowernode.crm.model.Auth;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthMapper {
    int deleteByPrimaryKey(Integer authId);

    int insert(Auth record);

    int insertSelective(Auth record);

    Auth selectByPrimaryKey(Integer authId);

    int updateByPrimaryKeySelective(Auth record);

    int updateByPrimaryKey(Auth record);

    //通过id查询所拥有的权限
    List<Auth> selectAuthByUserId(int userId);

    //查询员工权限
    List<Auth> selectAll();

    //通过角色id查询权限
    List<Auth> selectAuthByRoleId(int roleId);
}