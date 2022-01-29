package com.nicolasgandrade.employees.service.implementation;

import com.nicolasgandrade.employees.model.Department;
import com.nicolasgandrade.employees.repository.DepartmentRepository;
import com.nicolasgandrade.employees.service.DepartmentService;
import com.nicolasgandrade.employees.service.exceptions.ResourceNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Override
    public Department save(Department department) {
        Department object = departmentRepository.save(department);
        return object;
    }

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Department findById(Long id) {
        return departmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Id not found."));
    }
}
