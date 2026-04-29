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
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class TestController1 {

    @Autowired
    User4 user4;

    public TestController1() {
        System.out.println("TestController1 Initialization");
    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct in TestController1 object hashcode " + this.hashCode()
            + " and user4 hashcode " + user4.hashCode());
    }

    @GetMapping(path = "/fetchUser1_1")
    public ResponseEntity<String> getUserDetails() {
        System.out.println("fetchUser api invoked");
        return ResponseEntity.status(HttpStatus.OK).body("");
    }
}
