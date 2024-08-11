package com.virtusa.css.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.css.dao.EmployeeRepository;
import com.virtusa.css.dto.CourierDTO;
import com.virtusa.css.dto.EmployeeDTO;
import com.virtusa.css.dto.UserDTO;
import com.virtusa.css.exception.ExceptionHandling;
@Service
public class EmployeeServiceImplementation implements IEmployeeService {
	@Autowired
	private EmployeeRepository dao;

	@Override
	public EmployeeDTO createEmployee(EmployeeDTO employee) {
		return dao.save(employee);
	}
	@Override
	public EmployeeDTO updateEmployees(EmployeeDTO employee) {
		return dao.save(employee);
	}
	@Override
	public EmployeeDTO getEmployees(int empId) {
		Optional<EmployeeDTO> optionalEmployee = dao.findById(empId);
		if (optionalEmployee.isPresent()) {
			return optionalEmployee.get();
		}
		return null;
	}
	@Override
	public void deleteEmployee(int empId) {
		dao.deleteById(empId);
	}
	@Override
	public List<EmployeeDTO> getAllEmployee() {
		return dao.findAll();
	}
	
	
    public EmployeeDTO getEmployee(int id) throws ExceptionHandling
    {
        return dao.findById(id).orElseThrow(
            ()
                -> new ExceptionHandling(
                    "NO Employee PRESENT WITH ID = " + id));
    }
    
    
    public String updateEmployee(EmployeeDTO employeedto) throws ExceptionHandling {
    	EmployeeDTO existingEmployee
            = dao.findById(employeedto.getEmpId())
                  .orElse(null);
        if (existingEmployee == null)
            throw new ExceptionHandling(
                "No Such Employee exists!!");
        else {
        	existingEmployee.setEmpEmail(employeedto.getEmpEmail());
        	existingEmployee.setEmpName(employeedto.getEmpName());
        	existingEmployee.setEmpPhone(employeedto.getEmpPhone());
        	existingEmployee.setStatus(employeedto.getStatus());
            dao.save(existingEmployee);
            return "Record updated Successfully";
        }
    }
    
    
	public List<EmployeeDTO> getEmployeeByStatus(String status){
		return dao.getEmployeeByStatus(status);
	}
    

}
