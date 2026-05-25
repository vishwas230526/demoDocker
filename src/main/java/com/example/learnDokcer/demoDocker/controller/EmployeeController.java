package com.example.learnDokcer.demoDocker.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.learnDokcer.demoDocker.entity.Employee;
import com.example.learnDokcer.demoDocker.service.EmployeeService;

@RestController
public class EmployeeController {

private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){

        return employeeService.addEmp(employee);
    }
    
}
