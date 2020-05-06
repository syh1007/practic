package com.sshDemo.spring.service;

import com.sshDemo.spring.model.User;

import java.util.List;

/**
 * @author changling
 * @creator 2020-04-04 22:26
 */
public interface UserService {
    List<User> getAll();
}
