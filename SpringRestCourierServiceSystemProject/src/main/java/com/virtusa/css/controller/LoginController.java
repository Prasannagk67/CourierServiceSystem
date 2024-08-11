package com.virtusa.css.controller;

import java.util.List;
import java.util.Objects;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.weaver.ast.And;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.css.dao.LoginRepository;
import com.virtusa.css.dto.LoginDTO;
import com.virtusa.css.dto.UserDTO;
import com.virtusa.css.service.UserServiceImplementation;
@RestController
public class LoginController {
	@Autowired
	private LoginRepository dao;
	Log log =LogFactory.getLog(EmployeeController.class);
	@GetMapping("/validate/{name}/{password}")
	public ResponseEntity<?> validate(@PathVariable("name") String name, @PathVariable("password") String password){
	
	LoginDTO a=null;
	a=dao.getvalidate(name,password);
	if(a!=null) {
		log.info("Login Successfull By :"+name);
		return new ResponseEntity<String>("Login SuccessFull",HttpStatus.FOUND);
	}
	log.info("Login Failed By :"+name);
	return new ResponseEntity<String>("Login Failed",HttpStatus.FOUND);
}
}