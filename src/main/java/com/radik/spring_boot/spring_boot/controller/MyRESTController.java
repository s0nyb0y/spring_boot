package com.radik.spring_boot.spring_boot.controller;

import com.radik.spring_boot.spring_boot.entity.Employee;
import com.radik.spring_boot.spring_boot.handling_exception.NoSuchEmployeeException;
import com.radik.spring_boot.spring_boot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {
    private final EmployeeService employeeService;

    @Autowired
    public MyRESTController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable("id") int id) {
        Employee employee = employeeService.getEmployee(id);
        if (employee == null) {
            throw new NoSuchEmployeeException("There is no Employee with id = " + id + " in Database");
        } else {
            return employeeService.getEmployee(id);
        }
    }

    @PostMapping("/employees")
    public String addNewEmployee(@RequestBody Employee employee) {
        employeeService.addOrUpdateEmployee(employee);
        return "New Employee with added";
    }
    @PutMapping("/employees")
    public String updateEmployee(@RequestBody Employee employee){
        int empId = employee.getId();
        employeeService.addOrUpdateEmployee(employee);
        return "Employee with id = " + empId + " was updated";
    }
    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable("id")int id){
        employeeService.deleteEmployee(id);
        return "Employee with id = " + id + " was deleted";
    }
}
