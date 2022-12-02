package com.employee.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.domain.Employee;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {

	@GetMapping("/api/employees")
	public List<Employee> getData() {
		Employee employee = new Employee();
		employee.setNumber(6566);
		employee.setFirstName("Jayasri");
		employee.setPhoneNo(998989999);
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(employee);
		return empList;
	}
}
