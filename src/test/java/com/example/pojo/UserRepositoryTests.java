package com.example.pojo;

import com.example.dao.UserRepository;
import com.example.Application;
import org.hibernate.annotations.SourceType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by maozz11347 on 2017/6/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
//@SpringApplicationConfiguration(classes = Application.class)// 1.4.0 前版本
public class UserRepositoryTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public  void  test() throws  Exception{
        Date date=new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);

      //  userRepository.save(new User("aa1", "aa@126.com", "aa", "aa123456",formattedDate));
     //   userRepository.save(new User("bb2", "bb@126.com", "bb", "bb123456",formattedDate));
      //  userRepository.save(new User("cc3", "cc@126.com", "cc", "cc123456",formattedDate));
      Assert.assertEquals(3, userRepository.findAll().size());
        Assert.assertEquals("bb", userRepository.findByUserNameOrEmail("bb2", "cc@126.com").getNickName());
      // userRepository.delete(userRepository.findByUserName("aa"));
    }

@Test
    @RequestMapping("/getUser")
    @Cacheable(value="user-key")
    public void getUser() {
        User user = userRepository.findByUserName("aa1");
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
            System.out.println(user.getEmail());
         System.out.println(user.getRegTime());
      //  return user;

    }


    }
