package com.radik.spring_boot.spring_boot.lesson1.dao;

import com.radik.spring_boot.spring_boot.lesson1.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee>getAllEmployees();

    Employee getEmployee(int id);

    void addNewOrUpdateEmployee(Employee employee);

    void deleteEmployee(int id);
}
