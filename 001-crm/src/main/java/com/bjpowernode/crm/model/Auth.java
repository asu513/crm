package com.bjpowernode.crm.model;

import java.io.Serializable;
import java.util.List;

public class Auth implements Serializable {
    private Integer authId;

    private String authName;

    private String authCode;

    private String authUrl;

    private Integer authStatus;

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

    public Integer getAuthId() {
        return authId;
    }

    public void setAuthId(Integer authId) {
        this.authId = authId;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getAuthUrl() {
        return authUrl;
    }

    public void setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
    }

    public Integer getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(Integer authStatus) {
        this.authStatus = authStatus;
    }
}