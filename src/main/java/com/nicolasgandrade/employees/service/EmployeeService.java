package com.nicolasgandrade.employees.service;

import com.nicolasgandrade.employees.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Employee save(Employee employee);
    List<Employee> findAll();
    Employee findById(Long id);
}
