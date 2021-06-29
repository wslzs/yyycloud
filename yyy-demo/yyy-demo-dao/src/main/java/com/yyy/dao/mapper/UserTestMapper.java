package com.yyy.dao.mapper;

import com.yyy.dao.bean.UserTest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * UserTestMapper
 *
 * @author WangShiLin
 * @date 2021/6/16
 */
@Mapper
public interface UserTestMapper {
    List<UserTest> queryAll();
}
