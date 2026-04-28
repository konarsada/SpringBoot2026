package com.learning.SpringBoot2026.dependencyInjection.setterInjection;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Order2 {
    public Order2() {
        System.out.println("Order2 Initiated");
    }
}
