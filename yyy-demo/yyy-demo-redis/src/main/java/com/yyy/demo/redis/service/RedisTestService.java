package com.yyy.demo.redis.service;

/**
 * ClassDescribe
 *
 * @author WangShiLin
 * @date 2021/7/8
 */
public interface RedisTestService {
    String queryRedisValueByKey(String redisKey);

    void setRedisData(String key, String value);
}
