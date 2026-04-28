package com.learning.SpringBoot2026.dependencyInjection.constructorInjection;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Order3 {
    public Order3() {
        System.out.println("Order3 Initiated");
    }
}
