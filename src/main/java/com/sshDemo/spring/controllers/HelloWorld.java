package com.sshDemo.spring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author changling
 * @creator 2020-04-02 16:00
 */
@RestController
public class HelloWorld {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Map helloWorld() {
        Map<String, Object> ret = new HashMap<>();
        ret.put("ret", "Hello World");
        return ret;
    }
}

