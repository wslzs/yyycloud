package com.yyy.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassDescribe
 *
 * @author WangShiLin
 * @date 2021/8/16
 */
@RestController
public class TestController {
    @Value("${server.port}")
    private String port;

    // 注入配置文件上下文
    private final ConfigurableApplicationContext applicationContext;

    public TestController(ConfigurableApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @GetMapping(value = "/test/{name}")
    public String test(@PathVariable String name) {
        return "success! hello: " + name + " i am from port " + port;
    }

    // 从上下文中读取配置
    @GetMapping(value = "/hi")
    public String sayHi() {
        return "Hello " + applicationContext.getEnvironment().getProperty("user.name");
    }
}
