package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // get all employees - return a list of employees
    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.getAllEmployees();
    }

    // get employee with id
    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable long id) {
        return employeeService.getEmployee(id);
    }

    // add employee
    @PostMapping("/employees")
    public void addEmployee(@RequestBody Employee employee) {
        // @RequestBody tells spring MVC that the body contains JSON representation of instance of Employee
        // conversion from JSON to the class instance happens automatically
        employeeService.addEmployee(employee);


    }
}
