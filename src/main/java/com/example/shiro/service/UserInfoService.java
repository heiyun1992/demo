package com.example.shiro.service;

import com.example.shiro.entity.UserInfo;

/**
 * Created by maozz11347 on 2017/7/5.
 */
public interface UserInfoService {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}
