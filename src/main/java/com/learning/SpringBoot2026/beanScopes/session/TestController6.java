package com.learning.SpringBoot2026.beanScopes.session;

import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope(value = "session")
@RequestMapping(value = "/api")
public class TestController6 {

    @Autowired
    User8 user8;

    public TestController6() {
        System.out.println("TestController6 instance created");
    }

    @PostConstruct
    public void init() {
        System.out.println("TestController6 object hashcode " + this.hashCode()
                + " with user8 hashcode " + user8.hashCode());
    }

    @GetMapping(path = "/fetchUser6")
    public ResponseEntity<String> getUserDetails() {
        System.out.println("fetchUser6 api invoked");
        return ResponseEntity.status(HttpStatus.OK).body("");
    }

    @GetMapping(path = "/logout")
    public ResponseEntity<String> logout(HttpServletRequest request) {
        System.out.println("End the session");

        HttpSession session = request.getSession();
        session.invalidate();

        return ResponseEntity.status(HttpStatus.OK).body("");
    }
}
