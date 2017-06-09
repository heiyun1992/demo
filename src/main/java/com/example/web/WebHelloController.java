package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

/**
 * Created by maozz11347 on 2017/6/7.
 */
@Controller
@RequestMapping("/web")
public class WebHelloController {

    @RequestMapping("/helloHtml")
    public String helloHtml(Map<String,Object> map){

        map.put("hello","from TemplateController.helloHtml");
        map.put("greeting","hello Mr.node");
        map.put("currentTime",new Date());
        return"/hello";
    }

    @RequestMapping("/layoutHtml")
    public String layoutHtml(Map<String,Object> map){

        map.put("greeting","HelloWorld Mr.node");
        map.put("currentTime",new Date());
        map.put("title","Mr.node");
        return"/layout";
    }
}
