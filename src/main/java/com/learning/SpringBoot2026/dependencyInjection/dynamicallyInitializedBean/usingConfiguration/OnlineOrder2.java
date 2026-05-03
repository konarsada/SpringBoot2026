package com.learning.SpringBoot2026.dependencyInjection.dynamicallyInitializedBean.usingConfiguration;

import org.springframework.context.annotation.Primary;

// we do not use @Component here in case of Dynamic Bean Allocation using Configuration
@Primary
public class OnlineOrder2 implements Order5 {

    public OnlineOrder2() {
        System.out.println("Online order5 initialized");
    }

    public void createOrder() {
        System.out.println("Online order5 created");
    }
}
