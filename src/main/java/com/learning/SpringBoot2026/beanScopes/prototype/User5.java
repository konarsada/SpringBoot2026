package com.learning.SpringBoot2026.beanScopes.prototype;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class User5 {

    public User5() {
        System.out.println("User5 Initialized");
    }

    @PostConstruct
    public void init() {
        System.out.println("User5 object hashcode " + this.hashCode());
    }
}
