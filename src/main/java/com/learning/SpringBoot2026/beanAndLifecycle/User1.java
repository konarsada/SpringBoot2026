package com.learning.SpringBoot2026.beanAndLifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User1 {
    @Autowired
    Order1 order1;

    @PostConstruct
    public void methodX() {
        System.out.println("PostConstruct method is called after User1 bean is created and dependencies are injected");
    }

    @PreDestroy
    public void methodY() {
        System.out.println("PreDestroy method is called before User1 bean is destroyed");
    }

    public User1() {
        System.out.println("User1 bean is created, eager initialization");
    }
}
