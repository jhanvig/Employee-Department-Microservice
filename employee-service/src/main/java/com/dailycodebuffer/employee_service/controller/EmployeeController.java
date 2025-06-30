package com.dailycodebuffer.employee_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.employee_service.model.Employee;
import com.dailycodebuffer.employee_service.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository repository;
	
	@PostMapping("/make")
	public Employee add(@RequestBody Employee employee) {
		return repository.add(employee);
	}
	
	@GetMapping("/all")
	public List<Employee> findAll() {
		return repository.findAll();
	}
	@GetMapping("/{id}")
	public Employee findById(@PathVariable("id") Long id){
		return repository.findById(id);
	}
	
	@GetMapping("/department/{departmentId}")
	public List<Employee> findByDepartment(@PathVariable("departmentId") Long departmentId)
	{
		return repository.findByDepartment(departmentId);
	}
}