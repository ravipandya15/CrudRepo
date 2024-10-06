package com.crudproject.codedecode.controller;

import com.crudproject.codedecode.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudproject.codedecode.repos.EmployeeCrudRepo;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeCrudRepo employeecrudRepo;
	
	@GetMapping("/emp")
	public void getEmployee()
	{
		System.out.println("working fine");
		Employee e1 = new Employee();
		e1.setEmployeeName("Ravi");
		employeecrudRepo.save(e1);
		System.out.println("completed");
	}
}
