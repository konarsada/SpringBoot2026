package com.learning.SpringBoot2026.dependencyInjection.dynamicallyInitializedBean.usingConfiguration;


// we do not use @Component here in case of Dynamic Bean Allocation using Configuration
public class OfflineOrder2 implements Order5 {

    public OfflineOrder2() {
        System.out.println("Offline order5 initialized");
    }

    public void createOrder() {
        System.out.println("Offline order5 created");
    }
}
