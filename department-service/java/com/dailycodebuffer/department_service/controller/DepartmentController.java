package com.dailycodebuffer.department_service.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.department_service.client.EmployeeClient;
import com.dailycodebuffer.department_service.model.Department;
import com.dailycodebuffer.department_service.repository.DepartmentRepository;

import io.micrometer.tracing.Tracer;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	@Autowired
	private DepartmentRepository repository;
	
	@Autowired
	private Tracer tracer;
	
	@Autowired
	private EmployeeClient employeeClient;
	@GetMapping("/trace")
	public String getDepartment() {
		String traceId=tracer.currentSpan().context().traceId();
		System.out.println("Inside Department Service with TraceID: "+traceId);
		return "Department Info - Trace ID: "+traceId;
	}
	
	@PostMapping("/make")
	public Department add(@RequestBody Department department) {
		return repository.addDepartment(department);
	}
	
	@GetMapping("/all")
	public List<Department> findAll(){
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Department findById(@PathVariable Long id) {
		return repository.findById(id);
	}
	
	@GetMapping("/with-employees")
	public List<Department> findAllWithEmployees(){
		List<Department> departments = repository.findAll();
		departments.forEach(department -> department.
				setEmployees(employeeClient.findByDepartment(department.getId())));
		return departments;
	}
	
}
