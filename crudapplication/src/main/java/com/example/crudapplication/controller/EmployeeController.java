package com.example.crudapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudapplication.model.Employee;
import com.example.crudapplication.repository.EmployeeRepositoy;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepositoy employeeRepositoy;
	/*
	 * @Autowired private Employee employee;
	 */
	
	//  retrive list of employee
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		List<Employee> lst = employeeRepositoy.findAll();
		for(Employee emp : lst) {
			System.out.println(emp.getFirstName());
		}
		return lst;
	}
}
