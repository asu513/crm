package com.bjpowernode.crm.model;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {
    private Integer userId;

    private String userName;

    private String userPwd;

    private List<Integer> authIds;

    private List<Integer> roleIds;

    public List<Integer> getAuthIds() {
        return authIds;
    }

    public void setAuthIds(List<Integer> authIds) {
        this.authIds = authIds;
    }

    public List<Integer> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List<Integer> roleIds) {
        this.roleIds = roleIds;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
}