package com.example.pojo;

import com.example.dao.UserRepository;
import com.example.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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

        //userRepository.save(new User("aa", "aa123456", "aa@126.com", "aa",formattedDate));
       // userRepository.save(new User("bb", "bb123456", "bb@126.com", "bb",formattedDate));
      // userRepository.save(new User("cc", "cc123456", "cc@126.com", "cc",formattedDate));
      Assert.assertEquals(3, userRepository.findAll().size());
       //Assert.assertEquals("bb", userRepository.findByUserNameOrEmail("bb1", "cc@126.com").getNickName());
       userRepository.delete(userRepository.findByUserName("aa"));
    }
}
