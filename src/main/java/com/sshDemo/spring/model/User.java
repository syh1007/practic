package com.sshDemo.spring.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author changling
 * @creator 2020-04-04 18:40
 */
@Data
public class User implements Serializable {
    private Integer id;
    private String name;
    private String password;
}
