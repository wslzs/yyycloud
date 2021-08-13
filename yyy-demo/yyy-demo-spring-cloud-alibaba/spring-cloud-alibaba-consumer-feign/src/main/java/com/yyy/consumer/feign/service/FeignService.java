package com.yyy.consumer.feign.service;

import com.yyy.consumer.feign.service.fallback.FallbackServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author wangshilin
 */
@FeignClient(value = "spring-cloud-alibaba-provider", fallback = FallbackServiceImpl.class)
public interface FeignService {
    /**
     * test
     *
     * @param message 参数
     * @return String
     */
    @GetMapping(value = "/test/{message}")
    String test(@PathVariable("message") String message);
}
