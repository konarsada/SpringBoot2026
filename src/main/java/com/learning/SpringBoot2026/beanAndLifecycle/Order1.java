package com.learning.SpringBoot2026.beanAndLifecycle;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Order1 {
    public Order1() {
        System.out.println("Order1 bean is created, lazy initialization");
    }
}
