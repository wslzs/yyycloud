package com.yyy.service;


import com.yyy.dto.UserTestDto;

import java.util.List;

/**
 * ClassDescribe
 *
 * @author WangShiLin
 * @date 2021/4/28
 */
public interface TestService {
    String test();

    List<UserTestDto> testQueryAll();
}
