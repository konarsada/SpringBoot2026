package com.learning.SpringBoot2026.dependencyInjection.dynamicallyInitializedBean.usingQuantifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("onlineOrderObject")
@Component
public class OnlineOrder implements Order4{

    public OnlineOrder() {
        System.out.println("Online order initialized");
    }

    public void createOrder() {
        System.out.println("Online order created");
    }
}
