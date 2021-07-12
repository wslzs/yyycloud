package com.yyy.demo.redis.impl;

import com.yyy.demo.redis.service.RedisTestService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * ClassDescribe
 *
 * @author WangShiLin
 * @date 2021/7/8
 */
@Service
public class RedisTestServiceImpl implements RedisTestService {
    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    public String queryRedisValueByKey(String redisKey) {
        return (String) redisTemplate.opsForValue().get(redisKey);
    }

    @Override
    public void setRedisData(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }
}
