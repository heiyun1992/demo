package com.example.mapper;

import com.example.entity.UserEntity;

import java.util.List;

/**
 * Created by maozz11347 on 2017/6/13.
 */
public interface UserXmlMapper {

    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    void insert(UserEntity user);

    void update(UserEntity user);

    void delete(Long id);

}
