package com.oocl.employeeapi.service;

import com.oocl.employeeapi.entity.Employee;

public interface EmployeeService {
    public void addEmployee(Employee employee);
    public void deleteEmployee(int id);
    public Employee queryEmployee(int id);
    public void updateEmployee(Employee employee);

}
