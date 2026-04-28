package com.learning.SpringBoot2026.dependencyInjection.setterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User2 {

    public Order2 order2;

    public User2() {
        System.out.println("User2 Initiated");
    }

    @Autowired
    public void setOrderDependency(Order2 order2) {
        this.order2 = order2;
    }
}
