package com.example.shiro.dao;

import com.example.shiro.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by maozz11347 on 2017/7/5.
 */
public interface UserInfoDao extends CrudRepository<UserInfo,Long> {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}
