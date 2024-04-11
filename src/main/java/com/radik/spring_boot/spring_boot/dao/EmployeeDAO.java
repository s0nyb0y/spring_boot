package com.radik.spring_boot.spring_boot.dao;

import com.radik.spring_boot.spring_boot.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee>getAllEmployees();

    Employee getEmployee(int id);

    void addNewOrUpdateEmployee(Employee employee);

    void deleteEmployee(int id);
}
