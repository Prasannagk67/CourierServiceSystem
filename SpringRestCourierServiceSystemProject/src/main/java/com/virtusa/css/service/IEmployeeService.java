package com.virtusa.css.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virtusa.css.dto.EmployeeDTO;
import com.virtusa.css.dto.UserDTO;
import com.virtusa.css.exception.ExceptionHandling;

public interface IEmployeeService {
	public EmployeeDTO createEmployee(EmployeeDTO employee);
	public EmployeeDTO updateEmployees(EmployeeDTO employee);
	public EmployeeDTO getEmployees(int empId);
	public void deleteEmployee(int empId);
	public List<EmployeeDTO> getAllEmployee();
	EmployeeDTO getEmployee(int id) throws ExceptionHandling;
	String updateEmployee(EmployeeDTO employeedto) throws ExceptionHandling;
	
}
