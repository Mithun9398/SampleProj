package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/emp")
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;
	@PostMapping
	public void add(@RequestBody EmpRequest req) {
		Employee emp = new Employee();
		emp.setAge(req.getAge());
		emp.setName(req.getName());
		emp.setId(req.getId());
	    employeeRepository.save(emp);
	}

}

