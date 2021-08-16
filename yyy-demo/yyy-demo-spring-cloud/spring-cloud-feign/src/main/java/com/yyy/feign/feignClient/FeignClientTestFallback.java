package com.yyy.feign.feignClient;

import org.springframework.stereotype.Component;

@Component
public class FeignClientTestFallback implements FeignTestClient {
    @Override
    public String test(String name) {
        return name + "您好，提供者调用失败！可能是服务未启用";
    }
}