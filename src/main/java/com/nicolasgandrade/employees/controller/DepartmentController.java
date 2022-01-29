package com.nicolasgandrade.employees.controller;

import com.nicolasgandrade.employees.model.Department;
import com.nicolasgandrade.employees.service.implementation.DepartmentServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/department")
public class DepartmentController {

    private final DepartmentServiceImpl departmentService;

    @PostMapping
    public ResponseEntity<Department> save(@RequestBody Department department) {
        Department object = departmentService.save(department);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{/id}").buildAndExpand(object.getId()).toUri();
        return ResponseEntity.created(uri).body(object);
    }

    @GetMapping
    public ResponseEntity<List<Department>> findAll() {
        List<Department> list = departmentService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> findById(@PathVariable Long id) {
        Department object = departmentService.findById(id);
        return ResponseEntity.ok().body(object);
    }
}
