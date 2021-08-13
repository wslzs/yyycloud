package com.yyy.consumer.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wangshilin
 */
@SpringBootApplication
@EnableFeignClients
public class SpringCloudAlibabaConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAlibabaConsumerFeignApplication.class, args);
    }
}
