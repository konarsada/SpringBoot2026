package com.learning.SpringBoot2026.profileAnotation;

import com.learning.SpringBoot2026.conditionalOnProperty.NoSqlConnection;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class NoSqlConn2 {

    @Value("${username}")
    String username;

    @Value("${password}")
    String password;

    NoSqlConn2() {
        System.out.println("NoSqlConn2 constructor username: " + username + " and password: " + password);
    }

    @PostConstruct
    public void init() {
        System.out.println("NoSqlConn2 initialized with username: " + username + " and password: " + password);
    }
}
