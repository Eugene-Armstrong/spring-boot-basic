package com.oocl.employeeapi.controller;

import com.oocl.employeeapi.entity.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @RequestMapping("/employees")
    public ArrayList<Employee> index() {
        ArrayList<Employee> employeesList = new ArrayList<>();

        Employee employee1 = new Employee(0,"小明",22,"男");
        Employee employee2 = new Employee(1,"小红",23,"女");
        employeesList.add(employee1);
        employeesList.add(employee2);

//        return "Hello Employees";
        return employeesList;
    }
}
