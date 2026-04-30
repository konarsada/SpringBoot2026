package com.learning.SpringBoot2026.beanScopes.request;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("request")
public class User6 {

    public User6() {
        System.out.println("User6 instance created");
    }

    @PostConstruct
    public void init() {
        System.out.println("User6 object hashcode " + this.hashCode());
    }
}
