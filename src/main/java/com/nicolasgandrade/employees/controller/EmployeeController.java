package com.nicolasgandrade.employees.controller;

import com.nicolasgandrade.employees.model.Employee;
import com.nicolasgandrade.employees.service.implementation.EmployeeServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    private final EmployeeServiceImpl employeeService;

    @PostMapping
    public ResponseEntity<Employee> save(@RequestBody Employee employee) {
        Employee object = employeeService.save(employee);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{/id}").buildAndExpand(object.getId()).toUri();
        return ResponseEntity.created(uri).body(object);
    }

    @GetMapping
    public ResponseEntity<List<Employee>> findAll() {
        List<Employee> list = employeeService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> findById(@PathVariable Long id) {
        Employee object = employeeService.findById(id);
        return ResponseEntity.ok().body(object);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        employeeService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
