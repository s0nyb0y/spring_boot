package com.radik.spring_boot.spring_boot.lesson3.dao;

import com.radik.spring_boot.spring_boot.lesson3.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    List<Employee>findAllByName(String name);
}
