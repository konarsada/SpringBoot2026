package com.learning.SpringBoot2026.beanScopes.request;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "request")
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class User7 {

    public User7() {
        System.out.println("User7 instance created");
    }

    @PostConstruct
    public void init() {
        System.out.println("User7 object hashcode " + this.hashCode());
    }
}
