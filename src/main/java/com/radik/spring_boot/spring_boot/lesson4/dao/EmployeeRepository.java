package com.radik.spring_boot.spring_boot.lesson4.dao;

import com.radik.spring_boot.spring_boot.lesson4.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
