package com.learning.SpringBoot2026.dependencyInjection.constructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User3 {
    Order3 order3;
    Invoice3 invoice3;

    public User3(Order3 order3) {
        this.order3 = order3;
        System.out.println("User3 initialized with only Order3z dependency");
    }

    @Autowired
    public User3(Invoice3 invoice3) {
        this.invoice3 = invoice3;
        System.out.println("User3 initialized with only Invoice3 dependency");
    }
}
