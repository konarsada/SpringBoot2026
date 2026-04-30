package com.learning.SpringBoot2026.beanScopes.singleton;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@Scope("singleton")
public class TestController2 {

    @Autowired
    User4 user4;

    public TestController2() {
        System.out.println("TestController2 Initialization");
    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct in TestController2 object hashcode " + this.hashCode()
                + " and user4 hashcode " + user4.hashCode());
    }

    @GetMapping(path = "/fetchUser_2")
    public ResponseEntity<String> getUserDetails() {
        System.out.println("fetchUser_2 api invoked");
        return ResponseEntity.status(HttpStatus.OK).body("");
    }
}
