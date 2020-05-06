package com.sshDemo.spring.controllers;

/**
 * @author changling
 * @creator 2020-04-04 20:23
 */

import com.sshDemo.spring.model.User;
import com.sshDemo.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/testUser")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public String index(){
        return "Hello";
    }

    @RequestMapping("/all")
    public List<User> getAll() {
        return userService.getAll();
    }
}
