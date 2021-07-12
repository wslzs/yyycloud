package com.yyy.core.common.exception;


/**
 * 获取锁处理异常
 *
 * @author wangshilin
 */
public class RedissonLockException extends RuntimeException {

    private static final long serialVersionUID = -6422212844622271825L;

    public RedissonLockException(String message) {
        super(message);
    }
}
