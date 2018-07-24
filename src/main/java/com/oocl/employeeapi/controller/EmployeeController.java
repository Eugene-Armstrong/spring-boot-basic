package com.oocl.employeeapi.controller;

import com.oocl.employeeapi.entity.Employee;
import com.oocl.employeeapi.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeServiceIpml;

    @GetMapping("")
    public ArrayList<Employee> getAllEmployees(){
        return employeeServiceIpml.getAllEmployee();
    }

    @PostMapping("")
    public ArrayList<Employee> addEmployee(@RequestBody Employee employee){
        employeeServiceIpml.addEmployee(employee);
        return employeeServiceIpml.getAllEmployee();
    }

    @DeleteMapping("{id}")
    public ArrayList<Employee> deleteEmployee(@PathVariable int id){
        employeeServiceIpml.deleteEmployee(id);
        return employeeServiceIpml.getAllEmployee();
    }

    @PutMapping("{id}")
    public Employee queryEmployee(@PathVariable int id){
        return employeeServiceIpml.queryEmployee(id);
    }

    @PatchMapping("")
    public ArrayList<Employee> updateEmployee(@RequestBody Employee employee){
        employeeServiceIpml.updateEmployee(employee);
        return employeeServiceIpml.getAllEmployee();
    }

}
