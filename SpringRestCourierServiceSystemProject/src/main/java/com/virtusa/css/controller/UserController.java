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
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.css.dao.CourierRepository;
import com.virtusa.css.dao.UserRepository;
import com.virtusa.css.dto.CourierDTO;
import com.virtusa.css.dto.EmployeeDTO;
import com.virtusa.css.dto.UserDTO;
import com.virtusa.css.exception.ExceptionHandling;
import com.virtusa.css.service.CourierServiceImplementation;
import com.virtusa.css.service.IUserService;
import com.virtusa.css.service.UserServiceImplementation;


@RestController
@CrossOrigin
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserServiceImplementation service;
	@Autowired
	private CourierServiceImplementation service1;

	
	Log log =LogFactory.getLog(UserController.class);
	@Autowired
	private UserRepository dao;
	@Autowired
	private CourierRepository dao1;
	@PostMapping(consumes = "application/json", produces = "application/json", path = "/useradd")
	public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO user) {
		log.info("User Added Successfull");
		return new ResponseEntity<>(service.createUser(user), HttpStatus.CREATED);
	}
    @PutMapping("/updateuser")
    public String
    updateUsers(@RequestBody UserDTO userdto) throws ExceptionHandling
    {
    	log.info("User Update Successfull");
        return service.updateUsers(userdto);
    }
	@DeleteMapping(path = "/userdelete/{userId}")
	public ResponseEntity<String> deleteUser(@PathVariable(value = "userId") int userId) {
		service.deleteUser(userId);
		log.info("User Delete Successfull");
		return new ResponseEntity<>("User with UserId : " + userId + " deleted successfully", HttpStatus.OK);
	}
	
	@DeleteMapping(path = "/deletecourier/{courierId}")
	public ResponseEntity<String> deleteCourier(@PathVariable(value = "courierId") int courierId) {
		service1.deleteCourier(courierId);
		log.info("Courier Delete Successfull");
		return new ResponseEntity<>("Courier with courierId : " + courierId + " deleted successfully", HttpStatus.OK);
	}
	
	
	@GetMapping(path = "/getusers/{userId}", produces = "application/json")
	public ResponseEntity<?> getUser(@PathVariable(value = "userId") int userId){
		UserDTO u=null;
		if(dao.existsById(userId)) {
			log.info("User Details Fetched Successfull");
			Optional<UserDTO> o=dao.findById(userId);
			u=o.get();
			return new ResponseEntity<UserDTO>(u,HttpStatus.FOUND);
		}
		log.info("UserId Not Found");
		return new ResponseEntity<String>("Sorry User ID Not Found", HttpStatus.NOT_FOUND);
	}
	@GetMapping("/getuser/{id}")
    public UserDTO getUsers(@PathVariable("id") int id) throws Exception
    {
		log.info("User Details Fetched By id Successfull");
        return service.getUsers(id);
    }
	
	@PutMapping(consumes = "application/json", produces = "application/json", path = "/courieradd")
	public String saveCourierDTO(@RequestBody CourierDTO courier) {
		log.info("Courier Added Successfull");
		service1.saveCourierDTO(courier);
		return "Courier Added Successfull";
	}
	
	@GetMapping(path = "/getcouriers/{courierId}", produces = "application/json")
	public ResponseEntity<?> getCouriers(@PathVariable(value = "courierId") int courierId){
		CourierDTO u=null;
		if(dao1.existsById(courierId)) {
			log.info("Unknown person Fetched courier Successfull");
			Optional<CourierDTO> o=dao1.findById(courierId);
			u=o.get();
			return new ResponseEntity<CourierDTO>(u,HttpStatus.FOUND);
		}	
		log.info("Courierid Not Found");
		return new ResponseEntity<String>("Sorry CourierID Not Found", HttpStatus.NOT_FOUND);
}
	
	@GetMapping("/getcourier/{UserId}")
	public ResponseEntity<List<CourierDTO>> getCourierByUserid(@PathVariable int UserId){
		log.info("User Get Courier Details By UserID Successfull");
		return new ResponseEntity<>(service1.getCourierByUserid(UserId),HttpStatus.OK);
	}
	
}