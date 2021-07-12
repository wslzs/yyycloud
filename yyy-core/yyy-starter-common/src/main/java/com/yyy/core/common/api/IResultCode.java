package com.yyy.core.common.api;

/**
 * 返回码接口
 *
 * @author wangshilin
 */
public interface IResultCode {

    /**
     * 返回码
     *
     * @return int
     */
    int getCode();

    /**
     * 返回消息
     *
     * @return String
     */
    String getMsg();
}
