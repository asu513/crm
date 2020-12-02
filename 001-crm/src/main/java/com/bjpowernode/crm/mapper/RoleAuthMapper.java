package com.bjpowernode.crm.mapper;

import com.bjpowernode.crm.model.RoleAuth;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleAuthMapper {
    int deleteByPrimaryKey(Integer roleAuthId);

    int insert(RoleAuth record);

    int insertSelective(RoleAuth record);

    RoleAuth selectByPrimaryKey(Integer roleAuthId);

    int updateByPrimaryKeySelective(RoleAuth record);

    int updateByPrimaryKey(RoleAuth record);

    //删除旧权限
    int deleteByRole(Integer roleId);
    //写入新权限
    int insertBatch(Integer roleId, int[] authIds);
}