package com.learning.SpringBoot2026.aop;

import org.springframework.stereotype.Service;

@Service
public class EmployeeUtil {

    public void employeeHelperMethod() {
        System.out.println("EmployeeUtil: employeeHelperMethod called");
    }
}
