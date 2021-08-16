package com.yyy.feign.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * ClassDescribe
 *
 * @author WangShiLin
 * @date 2021/8/16
 */
@FeignClient(name = "provider",fallback = FeignClientTestFallback.class)
public interface FeignTestClient {
    @GetMapping("/test/{name}")
    String test(@PathVariable(value="name") String name);
}
