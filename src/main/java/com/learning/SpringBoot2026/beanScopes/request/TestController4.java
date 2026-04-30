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
@Scope("request")
@RequestMapping(value = "/api")
public class TestController4 {

    @Autowired
    User6 user6;

    @Autowired
    Student2 student2;

    public TestController4() {
        System.out.println("TestController4 instance created");
    }

    @PostConstruct
    public void init() {
        System.out.println("TestController4 object hashcode " + this.hashCode()
                + " with user6 hashcode " + user6.hashCode()
                + " and student2 hashcode " + student2.hashCode());
    }

    @GetMapping(path = "/fetchUser4")
    public ResponseEntity<String> getUserDetails() {
        System.out.println("fetchUser4 api invoked");
        return ResponseEntity.status(HttpStatus.OK).body("");
    }
}
