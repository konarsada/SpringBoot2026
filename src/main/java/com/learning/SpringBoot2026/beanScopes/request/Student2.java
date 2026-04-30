package com.learning.SpringBoot2026.beanScopes.request;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student2 {

    @Autowired
    User6 user6;

    public Student2() {
        System.out.println("Student2 instance created");
    }

    @PostConstruct
    public void init() {
        System.out.println("Student2 object hashcode " + this.hashCode()
                + " with user6 hashcode " + user6.hashCode());
    }
}
