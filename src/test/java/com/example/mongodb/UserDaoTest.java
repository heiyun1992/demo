package com.example.mongodb;

import com.example.mongodb.dao.UserDao;
import com.example.mongodb.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by maozz11347 on 2017/7/3.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void testSaveUser() throws Exception {
        UserEntity user=new UserEntity();
        user.setId(2l);
        user.setUserName("小毛刘");
        user.setPassWord("1213");
        userDao.saveUser(user);
    }

    @Test
    public void findUserByUserName(){
        UserEntity user= userDao.findUserByUserName("小毛刘");
        System.out.println("user is "+user);
    }

    @Test
    public  void updateUser(){
        UserEntity user=new UserEntity();
        user.setId(3l);
        user.setUserName("刘小毛");
        user.setPassWord("931213");
        userDao.updateUser(user);
    }


    @Test
    public void deleteUserById(){
        userDao.deleteUserById(1l);
    }
}
