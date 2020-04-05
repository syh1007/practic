package com.sshDemo.spring.dao;

import com.sshDemo.spring.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author changling
 * @creator 2020-04-04 19:04
 */
@Repository
@Mapper
public interface UserDao {
    List<User> getAll();
}
