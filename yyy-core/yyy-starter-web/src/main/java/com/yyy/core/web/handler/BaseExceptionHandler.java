package com.yyy.core.web.handler;

import com.yyy.core.common.api.Result;
import com.yyy.core.common.exception.BaseException;
import com.yyy.core.common.exception.PreviewException;
import com.yyy.core.common.exception.TokenException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.io.FileNotFoundException;

/**
 * Springboot WEB应用全局异常处理
 *
 * @author wangshilin
 */
@Slf4j
@ResponseBody
@RestControllerAdvice
public class BaseExceptionHandler {

    /**
     * BaseException 异常捕获处理
     *
     * @param ex 自定义BaseException异常类型
     * @return Result
     */
    @ExceptionHandler
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public Result<?> handleException(BaseException ex) {
        log.error("程序异常：" + ex.toString());
        return Result.fail(HttpStatus.UNAUTHORIZED.value(), ex.getMessage());
    }

    /**
     * TokenException 异常捕获处理
     *
     * @param ex 自定义TokenException异常类型
     * @return Result
     */
    @ExceptionHandler
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public Result<?> handleException(TokenException ex) {
        log.error("程序异常==>errorCode:{}, exception:{}", HttpStatus.UNAUTHORIZED.value(), ex.getMessage());
        return Result.fail(HttpStatus.UNAUTHORIZED.value(), ex.getMessage());
    }

    /**
     * FileNotFoundException,NoHandlerFoundException 异常捕获处理
     *
     * @param exception 自定义FileNotFoundException异常类型
     * @return Result
     */
    @ExceptionHandler({FileNotFoundException.class, NoHandlerFoundException.class})
    public Result<?> noFoundException(Exception exception) {
        log.error("程序异常==>errorCode:{}, exception:{}", HttpStatus.NOT_FOUND.value(), exception.getMessage());
        return Result.fail(HttpStatus.NOT_FOUND.value(), exception.getMessage());
    }

    /**
     * PreviewException 空指针异常捕获处理
     *
     * @param ex 自定义PreviewException异常类型
     * @return Result
     */
    @ExceptionHandler
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Result<?> handleException(PreviewException ex) {
        log.error("程序异常：" + ex.toString());
        return Result.fail(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());
    }

    /**
     * NullPointerException 空指针异常捕获处理
     *
     * @param ex 自定义NullPointerException异常类型
     * @return Result
     */
    @ExceptionHandler
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Result<?> handleException(NullPointerException ex) {
        log.error("程序异常：{}" + ex.toString());
        return Result.fail(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());
    }

    /**
     * 通用Exception异常捕获
     *
     * @param ex 自定义Exception异常类型
     * @return Result
     */
    @ExceptionHandler
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Result<?> handleException(Exception ex) {
        log.error("程序异常：" + ex.toString());
        String message = ex.getMessage();
        String str = "Bad credentials";
        String internalAuthenticationServiceException = "InternalAuthenticationServiceException";
        if (StringUtils.contains(message, str)) {
            message = "您输入的密码不正确";
        } else if (StringUtils.contains(ex.toString(), internalAuthenticationServiceException)) {
            message = "您输入的用户名不存在";
        }
        return Result.fail(HttpStatus.INTERNAL_SERVER_ERROR.value(), message);
    }
}
