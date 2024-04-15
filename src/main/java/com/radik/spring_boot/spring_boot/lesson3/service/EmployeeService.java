package com.radik.spring_boot.spring_boot.lesson3.service;

import com.radik.spring_boot.spring_boot.lesson3.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee>getAllEmployees();

    Employee getEmployee(int id);

    Employee saveOrUpdate(Employee employee);

    void deleteEmployee(int id);
    List<Employee>findAllByName(String name);
}
