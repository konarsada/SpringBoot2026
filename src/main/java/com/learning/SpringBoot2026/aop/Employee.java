package com.learning.SpringBoot2026.aop;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class Employee() {

    @GetMapping(path="/fetchEmployee")

}
