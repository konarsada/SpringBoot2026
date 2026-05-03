package com.learning.SpringBoot2026.dependencyInjection.dynamicallyInitializedBean.usingQuantifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("offlineOrderObject")
@Component
public class OfflineOrder implements Order4{

    public OfflineOrder() {
        System.out.println("Offline order initialized");
    }

    public void createOrder() {
        System.out.println("Offline order created");
    }
}
