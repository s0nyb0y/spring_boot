package com.radik.spring_boot.spring_boot.lesson3.controller;

import com.radik.spring_boot.spring_boot.lesson3.entity.Employee;
import com.radik.spring_boot.spring_boot.lesson3.exception_handler.NoSuchEmployeeException;
import com.radik.spring_boot.spring_boot.lesson3.service.EmployeeService;
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
    public Employee getEmployee(@PathVariable("id")int id){
        Employee employee = employeeService.getEmployee(id);
        if (employee == null){
            throw new NoSuchEmployeeException("There is no Employee with id = " + id + " in Database");
        }
        return employee;
    }
    @PostMapping("/employees")
    public Employee saveOrUpdate(@RequestBody Employee employee){
        return employeeService.saveOrUpdate(employee);
    }
    @PutMapping("/employees")
    public String updateEmployee(@RequestBody Employee employee){
        employeeService.saveOrUpdate(employee);
        return "Employee with id = " + employee.getId() + " was updated";
    }
    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable("id")int id){
        employeeService.deleteEmployee(id);
        return "Employee with id = " + id + " was deleted";
    }
    @GetMapping("/employees/name/{name}")
    public List<Employee>findAllByName(@PathVariable("name")String name){
        return employeeService.findAllByName(name);
    }
}
