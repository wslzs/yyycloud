package com.yyy.core.redis.props;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * redis配置
 *
 * @author pangu
 */
@Getter
@Setter
@ConfigurationProperties(YyyRedisProperties.PREFIX)
public class YyyRedisProperties {
	/**
	 * 前缀
	 */
	public static final String PREFIX = "yyy.lettuce.redis";
	/**
	 * 是否开启Lettuce
	 */
	private Boolean enable = true;
}
