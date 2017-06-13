package com.example.mapper;

import com.example.Application;
import com.example.entity.UserEntity;
import com.example.enums.UserSexEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by maozz11347 on 2017/6/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class UserXmlMapperTest {
    @Autowired
    private UserXmlMapper userMapper;

    @Test
    public void testInsert() throws Exception{
        userMapper.insert(new UserEntity("aa","a123456", UserSexEnum.MAN));
        userMapper.insert(new UserEntity("bb","b123456", UserSexEnum.MAN));
        userMapper.insert(new UserEntity("cc","c123456", UserSexEnum.MAN));
    }

    @Test
    public void testQuery() throws Exception {
        List<UserEntity> users = userMapper.getAll();
        System.out.println(users.toString());
    }

    @Test
    public void testUpdate() throws Exception {
        UserEntity users=userMapper.getOne(28l);
        System.out.println(users.toString());
        users.setNickName("mao");
        userMapper.update(users);
        Assert.assertTrue("mao".equals(userMapper.getOne(28l).getNickName()));
    }
}
