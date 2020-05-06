package com.sshDemo.spring.service.impl;

import com.sshDemo.spring.dao.UserMapper;
import com.sshDemo.spring.model.User;
import com.sshDemo.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author changling
 * @creator 2020-04-04 22:25
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

}
