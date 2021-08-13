package com.yyy.demo.redis.service;

/**
 * ClassDescribe
 *
 * @author WangShiLin
 * @date 2021/7/8
 */
public interface RedisTestService {
    /**
     * 查询redis的value根据key
     *
     * @param redisKey key
     * @return String
     */
    String queryRedisValueByKey(String redisKey);

    /**
     * 设置值
     *
     * @param key   .
     * @param value .
     */
    void setRedisData(String key, String value);
}
