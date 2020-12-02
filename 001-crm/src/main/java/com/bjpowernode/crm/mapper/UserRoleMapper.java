package com.bjpowernode.crm.mapper;

import com.bjpowernode.crm.model.UserRole;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleMapper {
    int deleteByPrimaryKey(Integer userRoleId);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Integer userRoleId);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);

    //删除旧角色
    int deleteByUserId(int userId);

    //写入新角色
    int insertBatch(int userId, int[] roleIds);
}