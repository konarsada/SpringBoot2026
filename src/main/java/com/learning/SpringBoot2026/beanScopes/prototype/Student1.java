package com.learning.SpringBoot2026.beanScopes.prototype;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student1 {

    @Autowired
    User5 user5;

    public Student1() {
        System.out.println("Student1 Initialization");
    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct in Student1 object hashcode " + this.hashCode()
                + " and user5 hashcode " + user5.hashCode());
    }
}
