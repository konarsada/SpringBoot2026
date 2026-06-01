package com.learning.SpringBoot2026.conditionalOnProperty;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "mySqlConnection", value = "enabled", havingValue = "true", matchIfMissing = false)
public class MySqlConnection {
    MySqlConnection() {
        System.out.println("MySqlConnection initialized");
    }
}
