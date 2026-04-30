package com.learning.SpringBoot2026.anotations;

import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class SampleController {

    @InitBinder
    protected void initBinder(DataBinder binder) {
        binder.registerCustomEditor(String.class, "firstName", new FirstNamePropertyEditor());
        binder.registerCustomEditor(String.class, "firstName2", new FirstNamePropertyEditor());
    }

    @GetMapping(path = "/fetchUser1")
    public String getUserDetails(
            @RequestParam(value = "firstName") String firstName,
            @RequestParam(name = "lastName", required = false) String lastName,
            @RequestParam(value = "age") int age
    ) {
        return "User Details: " + firstName + " " + lastName + ", Age: " + age;
    }

    @GetMapping(path = "/fetchUser2")
    public String getUserDetails2(@RequestParam(value = "firstName2") String firstName2) {
        return "User Details: " + firstName2;
    }

    @GetMapping(path = "/fetchMarks/{marks}")
    public String getUserMarks(@PathVariable(value = "marks") int marks) {
        return "User Marks: " + marks;
    }

    @PostMapping(path = "/saveUser")
    public String saveUserDetails(@RequestBody LearningSbUser user) {
        return "User Saved: " + user.getFirstName() + " " + user.getLastName() + ", Age: " + user.getAge();
    }
}
