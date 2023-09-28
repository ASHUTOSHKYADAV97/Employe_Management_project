package com.youtub.serviceIMPL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youtub.model.Employee;
import com.youtub.reprosetry.EmployeeRepo;
import com.youtub.service.EmployeeService;

@Service

public class EmployeeServiceImpl implements EmployeeService{

	
	@Autowired
	private EmployeeRepo emploRepo;
	
	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		Employee emp = emploRepo.save(employee);
		return emp;
	}

	@Override
	public String removeEmployee(int id) {
		// TODO Auto-generated method stub
		
		emploRepo.deleteById(id);;
		return "Delet Data Success Fully";
	}

	@Override
	public Optional<Employee> findEmpbyId(int id) {
		// TODO Auto-generated method stub
		
		Optional<Employee> emp = emploRepo.findById(id);
		
		if(emp.isPresent()) {
		return emp;
		}else {
		
		return null;}
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		
		List<Employee> emlList = emploRepo.findAll()
		return emlList;
	}

	@Override
	public String updateEmployee(int id) {
		
		Optional<Employee> emp = emploRepo.findById(id);
		
		if(emp.isPresent()) {
			Employee emps = new Employee();
			emploRepo.save(emps);
			
			return "updated succsess fully";
			
		}else {
			return "employee not founded";
					
		}
	}

}
