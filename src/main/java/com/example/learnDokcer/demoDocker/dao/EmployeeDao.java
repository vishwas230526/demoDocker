package com.example.learnDokcer.demoDocker.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.learnDokcer.demoDocker.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer> {
    
}
