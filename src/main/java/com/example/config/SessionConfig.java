package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by maozz11347 on 2017/6/7.
 */
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 10)//设置Session失效时间
public class SessionConfig {
}
