package com.yyy.core.web.config;

import com.yyy.core.common.factory.YamlPropertySourceFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 统一异常处理配置
 * @author wangshilin
 */
@Configuration
@ComponentScan(value="com.yyy.core.web.handler")
@PropertySource(factory = YamlPropertySourceFactory.class, value = "classpath:yyy-error.yml")
public class ExceptionConfiguration {
}