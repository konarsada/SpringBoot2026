package com.learning.SpringBoot2026.beanScopes.prototype;

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
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@RequestMapping(value = "/api")
public class TestController3 {

    @Autowired
    User5 user5;

    @Autowired
    Student1 student1;

    public TestController3() {
        System.out.println("TestController3 Initialization");
    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct in TestController3 object hashcode " + this.hashCode()
                + " and student1 hashcode " + student1.hashCode()
                + " and user5 hashcode " + user5.hashCode());
    }

    @GetMapping(path = "/fetchUser3")
    public ResponseEntity<String> getUserDetails() {
        System.out.println("fetchUser3 api invoked");
        return ResponseEntity.status(HttpStatus.OK).body("Hello World");
    }
}
