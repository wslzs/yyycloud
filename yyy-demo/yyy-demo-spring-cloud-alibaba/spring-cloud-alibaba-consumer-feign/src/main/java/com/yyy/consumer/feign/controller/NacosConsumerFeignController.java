package com.yyy.consumer.feign.controller;

import com.yyy.consumer.feign.service.FeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosConsumerFeignController {

    private final FeignService feignService;

    public NacosConsumerFeignController(FeignService feignService) {
        this.feignService = feignService;
    }

    @GetMapping(value = "/test/hi")
    public String test() {
        return feignService.test("Hi Feign");
    }
}
