package com.yyy.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassDescribe
 *
 * @author WangShiLin
 * @date 2021/6/16
 */
@Data
public class UserTestDto implements Serializable {
    private String id;
    private String name;
    private String age;
    private String createTime;
}
