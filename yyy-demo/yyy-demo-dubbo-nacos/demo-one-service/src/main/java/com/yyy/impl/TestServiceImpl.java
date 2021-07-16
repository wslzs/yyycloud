package com.yyy.impl;

import cn.hutool.core.bean.BeanUtil;
import com.yyy.dao.bean.UserTest;
import com.yyy.dao.mapper.UserTestMapper;
import com.yyy.dto.UserTestDto;
import com.yyy.service.TestService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassDescribe
 *
 * @author WangShiLin
 * @date 2021/4/28
 */
@DubboService(version = "${dubbo-service.version}")
public class TestServiceImpl implements TestService {
    @Resource
    private UserTestMapper userTestMapper;

    @Override
    public String test() {
        return "success";
    }

    @Override
    public List<UserTestDto> testQueryAll() {
        List<UserTest> list = userTestMapper.queryAll();
        List<UserTestDto> result = new ArrayList<>();
        for (UserTest userTest: list) {
            UserTestDto userTestDto = new UserTestDto();
            BeanUtil.copyProperties(userTest,userTestDto);
            result.add(userTestDto);
        }
        return result;
    }
}
