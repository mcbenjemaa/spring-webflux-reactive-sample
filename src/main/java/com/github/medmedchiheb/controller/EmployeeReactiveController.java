package com.github.medmedchiheb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.medmedchiheb.model.Employee;
import com.github.medmedchiheb.repository.EmployeeRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/employees")
public class EmployeeReactiveController {
	
	
    private EmployeeRepository employeeRepository;

    public EmployeeReactiveController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
	
	
	@GetMapping("/{id}")
	private Mono<Employee> getEmployeeById(@PathVariable String id) {
	    return employeeRepository.findEmployeeById(id);
	}
	
	
	@GetMapping
	private Flux<Employee> getAllEmployees() {
	    return employeeRepository.findAllEmployees();
	}
}
