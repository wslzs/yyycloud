package com.yyy.demo.redis.controller;

import com.yyy.core.common.api.Result;
import com.yyy.demo.redis.service.RedisTestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassDescribe
 *
 * @author WangShiLin
 * @date 2021/7/8
 */
@RestController
@RequestMapping(value = "/redisTest")
public class RedisTestController {
    private final RedisTestService redisTestService;

    public RedisTestController(RedisTestService redisTestService) {
        this.redisTestService = redisTestService;
    }

    @RequestMapping(value = "/queryRedisValueByKey")
    public Result<?> queryRedisValueByKey(String redisKey) {
        String value = redisTestService.queryRedisValueByKey(redisKey);
        return Result.data(value);
    }

    @RequestMapping(value = "/setRedisData")
    public Result<?> setRedisData(String key, String value) {
        redisTestService.setRedisData(key, value);
        return Result.success("添加成功");
    }

}
