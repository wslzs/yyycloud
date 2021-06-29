package com.yyy.controller;

import com.yyy.dto.UserTestDto;
import com.yyy.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassDescribe
 *
 * @author WangShiLin
 * @date 2021/4/28
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {
    @DubboReference(version = "${dubbo-service.version}")
    TestService testService;
    @Value("${wsl.testString}")
    private String testString;

    @GetMapping("/test")
    public String test() {
        log.info("testString:{}", testString);
        return testService.test();
    }

    @GetMapping("/userTest")
    public List<UserTestDto> userTest() {
        log.info("testString:{}", testString);
        return testService.testQueryAll();
    }
}
