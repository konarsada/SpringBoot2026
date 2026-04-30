package com.learning.SpringBoot2026.beanScopes.request;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("singleton")
@RequestMapping(value = "/api")
public class TestController5 {

    @Autowired
    User7 user7;

    public TestController5() {
        System.out.println("TestController5 instance created");
    }

    @PostConstruct
    public void init() {
        System.out.println("TestController5 object hashcode " + this.hashCode()
                + " with user7 hashcode " + user7.hashCode());
    }

    @GetMapping(path = "/fetchUser5")
    public ResponseEntity<String> getUserDetails() {
        System.out.println("fetchUser5 api invoked");
        return ResponseEntity.status(HttpStatus.OK).body("");
    }
}
