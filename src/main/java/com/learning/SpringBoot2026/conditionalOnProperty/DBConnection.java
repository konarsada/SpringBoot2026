package com.learning.SpringBoot2026.conditionalOnProperty;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class DBConnection {

    @Autowired(required = false)
    MySqlConnection mySqlConnection;

    @Autowired(required = false)
    NoSqlConnection noSqlConnection;

    @PostConstruct
    public void init() {
        System.out.println("DB Connection created");
        System.out.println("Is mySqlConnection object null: " + Objects.isNull(mySqlConnection));
        System.out.println("Is noSqlConnection object null: " + Objects.isNull(noSqlConnection));
    }
}
