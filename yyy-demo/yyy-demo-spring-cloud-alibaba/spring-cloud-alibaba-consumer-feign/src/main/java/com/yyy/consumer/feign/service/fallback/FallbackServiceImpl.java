package com.yyy.consumer.feign.service.fallback;

import com.yyy.consumer.feign.service.FeignService;
import org.springframework.stereotype.Component;

@Component
public class FallbackServiceImpl implements FeignService {

    @Override
    public String test(String message) {
        return "test fallback";
    }
}
