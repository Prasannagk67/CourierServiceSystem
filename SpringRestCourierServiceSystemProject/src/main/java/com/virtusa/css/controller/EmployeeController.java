package com.virtusa.css.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.virtusa.css.dto.CourierDTO;
import com.virtusa.css.dto.EmployeeDTO;
import com.virtusa.css.dto.UserDTO;
import com.virtusa.css.exception.ExceptionHandling;
import com.virtusa.css.service.CourierServiceImplementation;
import com.virtusa.css.service.EmployeeServiceImplementation;
import com.virtusa.css.service.IEmployeeService;
@RestController
@CrossOrigin
@RequestMapping("emp")
public class EmployeeController {
	@Autowired
	private EmployeeServiceImplementation service;
	@Autowired
	private CourierServiceImplementation service1;	
	Log log =LogFactory.getLog(EmployeeController.class);
	@GetMapping("/getemployee/{id}")
    public EmployeeDTO getEmployee(@PathVariable("id") int id) throws Exception
    {
		log.info("Employee Fetched Details By Employeeid");
        return service.getEmployee(id);
    }
	
	
    @PutMapping("/updateemployee")
    public String updateEmployee(@RequestBody EmployeeDTO employeedto) throws ExceptionHandling
    {
    	log.info("Employee Updated Profile Successfull");
        return service.updateEmployee(employeedto);
    }
	
	@DeleteMapping(path = "/employeedelete/{empId}")
	public ResponseEntity<String> deleteEmployee(@PathVariable(value = "empId") int empId) {
		service.deleteEmployee(empId);
		log.info("Admin Deleted Employee Successfull");
		return new ResponseEntity<>("User with empId : " + empId + " deleted successfully", HttpStatus.OK);
	}
    
	@GetMapping("/getcourier/{EmpId}")
	public ResponseEntity<List<CourierDTO>> getCourierByEmpid(@PathVariable int EmpId){
		log.info("Employee Get Couriers By His Employeeid");
		return new ResponseEntity<>(service1.getCourierByEmpid(EmpId),HttpStatus.OK);
	}
	
	@PutMapping(consumes = "application/json", produces = "application/json", path = "/courierupdate")
	public String updateCourier(@RequestBody CourierDTO courier) {
		service1.updateCourier(courier);
		log.info("Employee Updated Courie Details");
		return "Courier Updated Successfull";
	}    
}
