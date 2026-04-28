package com.learning.SpringBoot2026.dependencyInjection.constructorInjection;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Invoice3 {
    public Invoice3() {
        System.out.println("Invoice3 Initiated");
    }
}
