package com.example.web;

import com.example.entity.UserEntity;
import com.example.mapper.test1.User1Mapper;
import com.example.mapper.test2.User2Mapper;
import com.example.mapper.test3.User3Mapper;
import com.example.mapper.test4.User4Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by maozz11347 on 2017/6/14.
 */
@RestController
@RequestMapping("/user")
public class UserMuliDatasourceController {

    @Autowired
    private User1Mapper user1Mapper;

    @Autowired
    private User2Mapper user2Mapper;

    @Autowired
    private User3Mapper user3Mapper;

    @Autowired
    private User4Mapper user4Mapper;

    @RequestMapping("/getUsers1")
    public List<UserEntity> getUsers() {
        List<UserEntity> users=user1Mapper.getAll();
        return users;
    }

    @RequestMapping("/getUsers2")
    public List<UserEntity> getUsers2() {
        List<UserEntity> users=user2Mapper.getAll();
        return users;
    }

/*    @RequestMapping("/getUsers3")
    public List<UserEntity> getUsers3() {
        List<UserEntity> users=user3Mapper.getAll();
        return users;
    }

    @RequestMapping("/getUsers4")
    public List<UserEntity> getUsers4() {
        List<UserEntity> users=user4Mapper.getAll();
        return users;
    }*/

    @RequestMapping("/getUser2")
    public UserEntity getUser(int id) {
        UserEntity user=user2Mapper.getOne(new Long((long)id));
        return user;
    }

    @RequestMapping("/add")
    public void save(UserEntity user) {
        user2Mapper.insert(user);
    }

    @RequestMapping(value="update")
    public void update(UserEntity user) {
        user2Mapper.update(user);
    }

    @RequestMapping(value="/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        user1Mapper.delete(id);
    }


}