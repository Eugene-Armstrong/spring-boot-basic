package com.oocl.employeeapi.service;

import com.oocl.employeeapi.dao.EmployeeDAO;
import com.oocl.employeeapi.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    ArrayList<Employee> employeesList = new ArrayList<Employee>(){{
        add(new Employee(0,"小明",22,"男"));
        add(new Employee(1,"小红",20,"女"));
        add(new Employee(2,"小方",29,"男"));
    }};

    public ArrayList<Employee> getAllEmployee(){
        return employeesList;
    }

    @Override
    public void addEmployee(Employee employee) {
        try {
            employeesList.add(employee);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteEmployee(int id) {
        try {
//            for(int i=0;i<employeesList.size();i++){
//                if(employeesList.get(i).getId()==id){
//                    employeesList.remove(i);
//                    break;
//                }
//            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void queryEmployee(int id) {
        try {
            //
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateEmployee(Employee employee) {
        try {
            //
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}