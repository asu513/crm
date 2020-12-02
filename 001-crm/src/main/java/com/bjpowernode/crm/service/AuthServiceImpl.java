package com.bjpowernode.crm.service;

import com.bjpowernode.crm.mapper.AuthMapper;
import com.bjpowernode.crm.model.Auth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者：阿苏
 * 日期：2020/12/01/21:18
 * 描述：权限实现类
 */
@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    AuthMapper authMapper;
    //通过id查询所拥有的权限
    @Override
    public List<Auth> queryAuthByUserId(int userId) {
        return authMapper.selectAuthByUserId(userId);
    }

    //查询所有权限
    @Override
    public List<Auth> list() {
        return authMapper.selectAll();
    }

    //添加权限
    @Override
    public void add(Auth auth) {
        authMapper.insertSelective(auth);
    }

    //通过主键查询
    @Override
    public Auth queryAuthByAuthId(int authId) {
        return authMapper.selectByPrimaryKey(authId);
    }

    //修改权限
    @Override
    public void modifyAuth(Auth auth) {
        authMapper.updateByPrimaryKeySelective(auth);
    }

    //通过角色id查询权限
    @Override
    public List<Auth> queryAuthByRoleId(int roleId) {
        return authMapper.selectAuthByRoleId(roleId);
    }


}
