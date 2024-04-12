package com.radik.spring_boot.spring_boot.lesson2.dao;

import com.radik.spring_boot.spring_boot.lesson2.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    private final EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return entityManager.createQuery("from Employee ").getResultList();
    }

    @Override
    public Employee getEmployee(int id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public void addOrUpdateEmployee(Employee employee) {
        Employee newEmployee = entityManager.merge(employee);
        employee.setId(newEmployee.getId());
    }

    @Override
    public void deleteEmployee(int id) {
        Query query = entityManager.createQuery("delete from Employee where id =: employeeId");
        query.setParameter("employeeId", id);
        query.executeUpdate();
    }
}
