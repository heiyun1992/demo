package com.example.rabbit.manay;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by maozz11347 on 2017/6/23.
 */
@Component
@RabbitListener(queues = "mao")
public class MaoReceiver1 {
    @RabbitHandler
    public void process(String neo) {
        System.out.println("Receiver 1: " + neo);
    }
}
