package com.learning.SpringBoot2026.bean_and_lifecycle;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Order {
    public Order() {
        System.out.println("Order bean is created, lazy initialization");
    }
}
