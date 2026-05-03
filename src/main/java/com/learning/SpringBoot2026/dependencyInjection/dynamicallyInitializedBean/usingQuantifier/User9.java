package com.learning.SpringBoot2026.dependencyInjection.dynamicallyInitializedBean.usingQuantifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class User9 {

    @Qualifier("onlineOrderObject")
    @Autowired
    Order4 onlineOrder;

    @Qualifier("offlineOrderObject")
    @Autowired
    Order4 offlineOrder;

    public User9() {
        System.out.println("User9 initialized");
    }

    @GetMapping(value = "/createOrder")
    public ResponseEntity<String> createOrder() {
        onlineOrder.createOrder();
        offlineOrder.createOrder();

        return ResponseEntity.ok("Order created successfully");
    }
}
