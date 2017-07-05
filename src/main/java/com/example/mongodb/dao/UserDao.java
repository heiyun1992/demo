package com.example.mongodb.dao;

import com.example.mongodb.entity.UserEntity;

/**
 * Created by maozz11347 on 2017/7/3.
 */
public interface UserDao {
    public void saveUser(UserEntity user);

    public UserEntity findUserByUserName(String userName);

    public int updateUser(UserEntity user);

    public void deleteUserById(Long id);
}
