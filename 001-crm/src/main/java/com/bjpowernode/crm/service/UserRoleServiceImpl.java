package com.bjpowernode.crm.service;

import com.bjpowernode.crm.mapper.UserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 作者：阿苏
 * 日期：2020/12/02/14:46
 * 描述：用户角色实现类
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    UserRoleMapper userRoleMapper;

    @Override
    public void megerRoleByUserId(int userId, int[] roleIds) {
        //删除旧角色
        int i1 = userRoleMapper.deleteByUserId(userId);
        System.out.println(i1);
        //写入新角色
        if(roleIds != null && roleIds.length > 0) {
            int i = userRoleMapper.insertBatch(userId, roleIds);
            System.out.println(i);
            //8e4ed12215cc2ed6fbccd1c7e048f20790d4a2bf
        }
    }
}
