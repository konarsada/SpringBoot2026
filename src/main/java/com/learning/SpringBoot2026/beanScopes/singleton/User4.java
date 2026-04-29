package com.learning.SpringBoot2026.beanScopes.singleton;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class User4 {

    public User4() {
        System.out.println("User4 Initialized");
    }

    @PostConstruct
    public void init() {
        System.out.println("User4 object hashcode " + this.hashCode());
    }
}
