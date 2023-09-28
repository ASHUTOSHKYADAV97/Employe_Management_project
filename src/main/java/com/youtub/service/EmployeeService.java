package com.youtub.service;

import java.util.List;
import java.util.Optional;

import com.youtub.model.Employee;

public interface EmployeeService {

	
	public Employee addEmployee(Employee employee);
	
	public String removeEmployee(int id);
	
	public Optional<Employee>  findEmpbyId(int id);
	
	public List<Employee> getAllEmployees();
	
	public String updateEmployee(int id);
}
