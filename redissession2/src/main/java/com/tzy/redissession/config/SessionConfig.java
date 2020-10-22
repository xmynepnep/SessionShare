package com.tzy.redissession.config;

import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableRedisHttpSession(maxInactiveIntervalInSeconds=7200,redisNamespace="base")
public class SessionConfig {

}
