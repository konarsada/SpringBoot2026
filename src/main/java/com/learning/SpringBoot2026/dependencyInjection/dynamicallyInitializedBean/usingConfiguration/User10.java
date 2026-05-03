package com.learning.SpringBoot2026.dependencyInjection.dynamicallyInitializedBean.usingConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class User10 {

    @Autowired
    Order5 order5;

    public User10() {
        System.out.println("User10 initialized");
    }

    @GetMapping(value = "/createOrder2")
    public ResponseEntity<String> createOrder() {
        order5.createOrder();

        return ResponseEntity.ok("Order created successfully");
    }
}
