package com.example.mapper;

import com.example.entity.UserEntity;
import com.example.enums.UserSexEnum;
import com.example.mapper.test2.User2Mapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by maozz11347 on 2017/6/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class User2MapperTest {
    @Autowired
    private User2Mapper userMapper;

    @Test
    public void testInsert() throws Exception {
        userMapper.insert(new UserEntity("aa2", "a123456", UserSexEnum.MAN));
        userMapper.insert(new UserEntity("bb2", "b123456", UserSexEnum.WOMAN));
        userMapper.insert(new UserEntity("cc2", "c123456", UserSexEnum.WOMAN));

        Assert.assertEquals(3, userMapper.getAll().size());
    }

    @Test
    public void testQuery() throws Exception {
        List<UserEntity> users = userMapper.getAll();
        if(users==null || users.size()==0){
            System.out.println("is null");
        }else{
            System.out.println(users.toString());
        }
    }


    @Test
    public void testUpdate() throws Exception {
        UserEntity user = userMapper.getOne(6l);
        System.out.println(user.toString());
        user.setNickName("neo");
        userMapper.update(user);
        Assert.assertTrue(("neo".equals(userMapper.getOne(6l).getNickName())));
    }

}
