package com.learning.SpringBoot2026.bean_and_lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Autowired
    Order order;

    @PostConstruct
    public void methodX() {
        System.out.println("PostConstruct method is called after User bean is created and dependencies are injected");
    }

    @PreDestroy
    public void methodY() {
        System.out.println("PreDestroy method is called before User bean is destroyed");
    }

    public User() {
        System.out.println("User bean is created, eager initialization");
    }
}
