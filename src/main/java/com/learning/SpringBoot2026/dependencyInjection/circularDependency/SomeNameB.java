package com.learning.SpringBoot2026.dependencyInjection.circularDependency;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class SomeNameB {

    @Lazy
    @Autowired
    SomeNameA someNameA;

    public SomeNameB() {
        System.out.println("SomeNameB constructor called");
    }

    @PostConstruct
    public void init() {
        System.out.println("SomeNameB @PostConstruct called SomeNameA hashCode: " + someNameA.hashCode()
                + ", SomeNameB hashCode: " + this.hashCode());
    }
}
