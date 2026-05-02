package com.learning.SpringBoot2026.dependencyInjection.circularDependency;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SomeNameA {

    @Autowired
    SomeNameB someNameB;

    public SomeNameA() {
        System.out.println("SomeNameA constructor called");
    }

    @PostConstruct
    public void init() {
        System.out.println("SomeNameA @PostConstruct called SomeNameA hashCode: " + this.hashCode()
            + ", SomeNameB hashCode: " + someNameB.hashCode());
    }
}
