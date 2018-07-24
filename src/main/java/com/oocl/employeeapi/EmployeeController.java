package com.oocl.employeeapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @RequestMapping("/employees")
    public String index() {
        return "Hello Employees";
    }
}
