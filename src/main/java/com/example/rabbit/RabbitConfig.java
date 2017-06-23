package com.example.rabbit;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by maozz11347 on 2017/6/23.
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }

    @Bean
    public Queue maoQueue() {
        return new Queue("mao");
    }

    @Bean
    public Queue objectQueue() {
        return new Queue("object");
    }
}
