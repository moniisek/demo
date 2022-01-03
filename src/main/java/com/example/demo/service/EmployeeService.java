package com.example.demo.service;

import com.example.demo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> employees = new ArrayList<Employee>(List.of(
            new Employee("Maria", "Andres", "maria.andres@gmail.com", 1),
            new Employee("Emily", "Wong", "emily.wong@hotmail.com", 2)
    ));

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee getEmployee(long id) {
        return employees.stream().filter(employee -> employee.getId() == id).findFirst().get();
    }

    public void addEmployee(Employee newEmployee) {
        employees.add(newEmployee);
    }
}
