package com.learning.SpringBoot2026.beanScopes.session;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class User8 {

    public User8() {
        System.out.println("User8 instance created");
    }

    @PostConstruct
    public void init() {
        System.out.println("User8 object hashcode " + this.hashCode());
    }
}
