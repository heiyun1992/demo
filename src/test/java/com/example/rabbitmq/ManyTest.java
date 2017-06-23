package com.example.rabbitmq;

import com.example.rabbit.manay.MaoSender1;
import com.example.rabbit.manay.MaoSender2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by maozz11347 on 2017/6/23.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyTest {

    @Autowired
    private MaoSender1 maoSender1;
    @Autowired
    private MaoSender2 maoSender2;

    /**
     * 一对多发送
     * @throws Exception
     */
    @Test
    public void oneToMany() throws Exception{
        for(int i=0;i<100;i++){
            maoSender1.send(i);
        }
    }

    /**
     * 多对多发送
     * @throws Exception
     */
    @Test
    public void manyToMany() throws Exception {
        for (int i=0;i<100;i++){
            maoSender1.send(i);
            maoSender2.send(i);
        }
    }


}
