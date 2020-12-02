package com.bjpowernode.crm.mapper;

import com.bjpowernode.crm.model.UserAuth;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAuthMapper {
    int deleteByPrimaryKey(Integer userAuthId);

    int insert(UserAuth record);

    int insertSelective(UserAuth record);

    UserAuth selectByPrimaryKey(Integer userAuthId);

    int updateByPrimaryKeySelective(UserAuth record);

    int updateByPrimaryKey(UserAuth record);

    //删除旧权限
    int deleteByUserId(int userId);

    //写入新权限
    int insertBatch(int userId, int[] authIds);
}