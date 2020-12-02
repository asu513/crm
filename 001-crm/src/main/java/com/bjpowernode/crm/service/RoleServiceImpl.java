package com.bjpowernode.crm.service;

import com.bjpowernode.crm.mapper.RoleMapper;
import com.bjpowernode.crm.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者：阿苏
 * 日期：2020/12/01/21:35
 * 描述：职务实现类
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleMapper roleMapper;

    //查询所有职务
    @Override
    public List<Role> list() {
        return roleMapper.selectAllRole();
    }

    //通过id查询所拥有的职务
    @Override
    public List<Role> queryRoleByUserId(int userId) {
        return roleMapper.selectRoleByUserId(userId);
    }

    //新增角色
    @Override
    public void save(Role role) {
        roleMapper.insertSelective(role);
    }

    //通过主键查询角色
    @Override
    public Role queryRoleByRoleId(int roleId) {
        return roleMapper.selectByPrimaryKey(roleId);
    }

    @Override
    public void modify(Role role) {
        roleMapper.updateByPrimaryKeySelective(role);
    }
}
