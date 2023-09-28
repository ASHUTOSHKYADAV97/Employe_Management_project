package com.youtub.reprosetry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youtub.model.Employee;

public interface EmployeeRepo  extends JpaRepository<Employee, Integer>{

}
