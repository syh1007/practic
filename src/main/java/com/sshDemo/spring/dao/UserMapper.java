package com.sshDemo.spring.dao;

import com.sshDemo.spring.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author changling
 * @creator 2020-04-04 19:04
 */
@Mapper
public interface UserMapper {
    List<User> getAll();
}
