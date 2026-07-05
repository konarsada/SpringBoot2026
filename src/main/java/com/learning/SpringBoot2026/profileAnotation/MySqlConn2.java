package com.learning.SpringBoot2026.profileAnotation;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class MySqlConn2 {

    @Value("${username}")
    String username;

    @Value("${password}")
    String password;

    MySqlConn2() {
        System.out.println("MySqlConn2 constructor username: " + username + " and password: " + password);
    }

    @PostConstruct
    public void init() {
        System.out.println("MySqlConn2 initialized with username: " + username + " and password: " + password);
    }
}
