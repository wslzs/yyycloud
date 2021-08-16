package com.yyy.feign.controller;

import com.yyy.feign.feignClient.FeignTestClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final FeignTestClient feignTestClient;

    public TestController(FeignTestClient feignTestClient) {
        this.feignTestClient = feignTestClient;
    }

    @GetMapping("/feign/test/{name}")
    public String test(@PathVariable String name) {
        return feignTestClient.test(name);
    }
}