package com.virtusa.css.controller;

import java.util.List;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

import com.virtusa.css.dao.UserRepository;
//import com.virtusa.css.dao.DeliveryRepository;
import com.virtusa.css.dto.CourierDTO;
//import com.virtusa.css.dto.DeliveryDTO;
import com.virtusa.css.dto.EmployeeDTO;
import com.virtusa.css.dto.LoginDTO;
import com.virtusa.css.dto.UserDTO;
import com.virtusa.css.exception.ExceptionHandling;
import com.virtusa.css.service.CourierServiceImplementation;
import com.virtusa.css.service.EmployeeServiceImplementation;
import com.virtusa.css.service.UserServiceImplementation;

@RestController
@CrossOrigin
@RequestMapping("admin")
public class AdminController {
	@Autowired
	private UserRepository dao;
	@Autowired
	private EmployeeServiceImplementation service;
	@Autowired
	private CourierServiceImplementation service1;
	@Autowired
	private UserServiceImplementation service3;
	
	Log log =LogFactory.getLog(AdminController.class);
	
	@GetMapping(path = "/getallusers", produces = "application/json")
	public ResponseEntity<List<UserDTO>> getAllUser() {
		log.info("Admin Get AllUSers Successfull");
		return new ResponseEntity<>(service3.getAllUser(), HttpStatus.OK);
	}
	
	
	@DeleteMapping(path = "/userdelete/{userId}")
	public ResponseEntity<String> deleteUser(@PathVariable(value = "userId") int userId) {
		log.info("Admin Deleted User By id Successfull");
		service3.deleteUser(userId);
		return new ResponseEntity<>("User with UserId : " + userId + " deleted successfully", HttpStatus.OK);
	}
	
	
	@GetMapping(path = "/getusers/{userId}", produces = "application/json")
	public ResponseEntity<?> getUser(@PathVariable(value = "userId") int userId){
		UserDTO u=null;
		if(dao.existsById(userId)) {
			log.info("Admin Get User Details BY Id Successfull");
			Optional<UserDTO> o=dao.findById(userId);
			u=o.get();
			return new ResponseEntity<UserDTO>(u,HttpStatus.FOUND);
		}
		return new ResponseEntity<String>("Sorry User ID Not Found", HttpStatus.NOT_FOUND);
	}
	
	
	@GetMapping(path = "/getcourierss", produces = "application/json")
	public ResponseEntity<List<CourierDTO>> findAllCouriersDTOs() {
		log.info("Admin Fetched All Couriers Successfull");
		return new ResponseEntity<>(service1.findAllCouriersDTOs(), HttpStatus.OK);
	}
	
	@GetMapping(path = "/getcourier/{courierId}", produces = "application/json")
	public ResponseEntity<CourierDTO> getCourier(@PathVariable(value = "courierId") int courierId) {
		log.info("Admin Get Courier Details By ID");
		return new ResponseEntity<>(service1.getCourier(courierId), HttpStatus.OK);
	}
	
	
	@PutMapping(path = "/assigncourier")
	public String updateCourier(@RequestBody CourierDTO courier) {
		service1.updateCourier(courier);
		log.info("Admin Assign Courier To Employee");
		return "Courier Assigned to Employee";
	}
	
	
	
	@PostMapping(consumes = "application/json", produces = "application/json", path = "/employeeadd")
	public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody EmployeeDTO employee) {
		log.info("Admin Added Employee Successfull");
		return new ResponseEntity<>(service.createEmployee(employee), HttpStatus.CREATED);
	}
	
	
    @PutMapping("/updateemployee")
    public String updateEmployee(@RequestBody EmployeeDTO employeedto) throws ExceptionHandling
    {
    	log.info("Admin Updated Employee Details Successfull");
        return service.updateEmployee(employeedto);
    }
	
	
	@DeleteMapping(path = "/employeedelete/{empId}")
	public ResponseEntity<String> deleteEmployee(@PathVariable(value = "empId") int empId) {
		service.deleteEmployee(empId);
		log.info("Admin Deleted Employee Successfull");
		return new ResponseEntity<>("User with empId : " + empId + " deleted successfully", HttpStatus.OK);
	}
	
	
	@GetMapping("/getemployee/{id}")
    public EmployeeDTO getEmployee(@PathVariable("id") int id) throws Exception
    {
		log.info("Admin Get Employee Details By Id");
        return service.getEmployee(id);
    }
	
	
	
	@GetMapping(path = "/getallemployees", produces = "application/json")
	public ResponseEntity<List<EmployeeDTO>> getAllEmployee() {
		return new ResponseEntity<>(service.getAllEmployee(), HttpStatus.OK);
	}
	
	@GetMapping("/status/{status}")
	public ResponseEntity<List<EmployeeDTO>> getEmployeeByStatus(@PathVariable String status){
		log.info("Admin Viewed Status of Employee");
		return new ResponseEntity<>(service.getEmployeeByStatus(status),HttpStatus.OK);
	}
}
