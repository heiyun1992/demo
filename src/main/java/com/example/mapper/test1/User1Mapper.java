package com.example.mapper.test1;

import com.example.entity.UserEntity;

import java.util.List;

/**
 * Created by maozz11347 on 2017/6/14.
 */
public interface User1Mapper {
    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    void insert(UserEntity user);

    void update(UserEntity user);

    void delete(Long id);
}
