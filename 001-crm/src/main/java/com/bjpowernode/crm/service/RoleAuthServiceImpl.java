package com.bjpowernode.crm.service;

import com.bjpowernode.crm.mapper.RoleAuthMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 作者：阿苏
 * 日期：2020/12/02/10:17
 * 描述：角色权限实现类
 */
@Service
public class RoleAuthServiceImpl implements RoleAuthService {

    @Autowired
    RoleAuthMapper roleAuthMapper;

    //向角色权限表写值
    @Override
    public void save(Integer roleId, int[] authIds) {
        //删除旧权限
        roleAuthMapper.deleteByRole(roleId);

        if(authIds != null && authIds.length > 0){
            //写入新权限
            roleAuthMapper.insertBatch(roleId,authIds);
        }
    }
}
