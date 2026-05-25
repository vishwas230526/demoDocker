
package com.example.learnDokcer.demoDocker.service;

import org.springframework.stereotype.Service;

import com.example.learnDokcer.demoDocker.dao.EmployeeDao;
import com.example.learnDokcer.demoDocker.entity.Employee;

@Service
public class EmployeeService {

    private final EmployeeDao employeeDao;

    public EmployeeService(EmployeeDao employeeDao){
        this.employeeDao = employeeDao;
    }

    public Employee addEmp(Employee emp){

        return employeeDao.save(emp);
    }
    
}
