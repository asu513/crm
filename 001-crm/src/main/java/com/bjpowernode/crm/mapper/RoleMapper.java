package com.bjpowernode.crm.mapper;

import com.bjpowernode.crm.model.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    //查询所有职务
    List<Role> selectAllRole();

    //通过id查询所拥有的职务
    List<Role> selectRoleByUserId(int userId);
}