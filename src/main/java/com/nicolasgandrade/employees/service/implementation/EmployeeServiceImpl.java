package com.nicolasgandrade.employees.service.implementation;

import com.nicolasgandrade.employees.model.Employee;
import com.nicolasgandrade.employees.repository.EmployeeRepository;
import com.nicolasgandrade.employees.service.EmployeeService;
import com.nicolasgandrade.employees.service.exceptions.ResourceNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee employee) {
        Employee object = employeeRepository.save(employee);
        return object;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Id not found."));
    }
}
