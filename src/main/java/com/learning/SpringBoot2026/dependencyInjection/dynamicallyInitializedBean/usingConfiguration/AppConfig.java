package com.learning.SpringBoot2026.dependencyInjection.dynamicallyInitializedBean.usingConfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
//    public Order5 createOrderBean(@Value("${false}") boolean isOnlineOrder) {
    public Order5 createOrderBean(@Value("${isOnlineOrder}") boolean isOnlineOrder) {
        if (isOnlineOrder) {
            return new OnlineOrder2();
        } else {
            return new OfflineOrder2();
        }
    }
}
