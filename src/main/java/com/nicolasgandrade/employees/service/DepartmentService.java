package com.nicolasgandrade.employees.service;

import com.nicolasgandrade.employees.model.Department;

import java.util.List;

public interface DepartmentService {

    Department save(Department department);
    List<Department> findAll();
    Department findById(Long id);
}
