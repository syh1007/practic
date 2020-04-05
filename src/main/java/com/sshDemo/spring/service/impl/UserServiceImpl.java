package com.sshDemo.spring.service;

import com.sshDemo.spring.dao.UserDao;
import com.sshDemo.spring.model.User;
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
    private UserDao userDao;

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

}
