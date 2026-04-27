package com.learning.SpringBoot2026.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    public Order order;

    public User() {
        System.out.println("User Initiated");
    }

    // setter injection
    @Autowired
    public void setOrderDependency(Order order) {
        this.order = order;
    }
}
