package com.oocl.employeeapi.controller;

import com.oocl.employeeapi.entity.Employee;
import com.oocl.employeeapi.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeServiceIpml;

    @GetMapping("/employees")
    public ArrayList<Employee> getAllEmployees(){
        return employeeServiceIpml.getAllEmployee();
    }

    @PostMapping("/employees")
    public ArrayList<Employee> addEmployee(Employee e){
        employeeServiceIpml.addEmployee(e);
        return employeeServiceIpml.getAllEmployee();
    }

    @DeleteMapping("/employees")
    public ArrayList<Employee> deleteEmployee(int id){
        employeeServiceIpml.deleteEmployee(id);
        return employeeServiceIpml.getAllEmployee();
    }

    @RequestMapping("/employees")
    public String index() {
        return "Hello Employees";
    }
}
