package com.example.web;

import com.example.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.UUID;


/**
 * Created by maozz11347 on 2017/6/5.
 */
@RestController
public class HelloWorldController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/hello")
    public String index() {
        return "Hello World!";
    }

    @RequestMapping("/getUser")
    public String getUser() {
        return "user!";
    }

 /*   @RequestMapping("/getUser1")
    @Cacheable(value="user-key")
    public String getUser1s() {
        User user=userRepository.findByUserName("aa");
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        System.out.println(user.toString());
        return user.toString();
    }*/

    @RequestMapping("/uid")
    String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        return session.getId();
    }
}
