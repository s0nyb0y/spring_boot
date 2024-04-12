package com.radik.spring_boot.spring_boot.lesson1.service;

import com.radik.spring_boot.spring_boot.lesson1.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee>getAllEmployees();

    Employee getEmployee(int id);

    void addOrUpdateEmployee(Employee employee);

    void deleteEmployee(int id);
}
