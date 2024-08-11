package com.virtusa.css.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.virtusa.css.dao.UserRepository;
import com.virtusa.css.dto.ErrorInfo;
import com.virtusa.css.dto.UserDTO;
import com.virtusa.css.exception.ExceptionHandling;
@Service
public class UserServiceImplementation implements IUserService {
	@Autowired
	private UserRepository dao;
	@Override
	public UserDTO createUser(UserDTO user) {
		return dao.save(user);
	}
	@Override
	public UserDTO updateUser(UserDTO user) {
		return dao.save(user);
	}
	@Override
	public UserDTO getUser(int userId) {
		Optional<UserDTO> optionalUser = dao.findById(userId);
		if (optionalUser.isPresent()) {
			return optionalUser.get();
		}
		return null;
	}
	@Override
	public void deleteUser(int userId) {
		dao.deleteById(userId);
	}
	@Override
	public List<UserDTO> getAllUser() {
		return dao.findAll();
	}
    public UserDTO getUsers(int id) throws ExceptionHandling
    {
        return dao.findById(id).orElseThrow(
            ()
                -> new ExceptionHandling(
                    "NO User PRESENT WITH ID = " + id));
    }
    
    
    
    public String updateUsers(UserDTO userdto) throws ExceptionHandling {
    	UserDTO existingUser
            = dao.findById(userdto.getUserId())
                  .orElse(null);
        if (existingUser == null)
            throw new ExceptionHandling(
                "No Such User exists!!");
        else {
            existingUser.setFullName(userdto.getFullName());
            existingUser.setUserEmail(userdto.getUserEmail());
            existingUser.setUserPhone(userdto.getUserPhone());
            dao.save(existingUser);
            return "Record updated Successfully";
        }
    }
    
    
    
    public String addUsers(UserDTO userdto) throws ExceptionHandling
    {
    	UserDTO existingUser
            = dao.findById(userdto.getUserId())
                  .orElse(null);
        if (existingUser == null) {
            dao.save(userdto);
            return "User added successfully";
        }
        else
            throw new ExceptionHandling(
                "User already exists!!");
    }

}
















//package com.virtusa.css.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.virtusa.css.dao.UserRepository;
//import com.virtusa.css.dto.UserDTO;
//@Service
//public class UserServiceImplementation implements IUserService {
//	@Autowired
//	private UserRepository dao;
//
//	@Override
//	public UserDTO saveUserDTO(UserDTO user) {
//		// TODO Auto-generated method stub
//		return dao.save(user);
//	}
//
//	@Override
//	public UserDTO updateUserDTO(UserDTO user) {
//		// TODO Auto-generated method stub
//		return dao.save(user);
//	}
//
//	@Override
//	public List<UserDTO> findAllUserDTOs() {
//		// TODO Auto-generated method stub
//		return (List<UserDTO>) dao.findAll();
//	}
//
//	@Override
//	public void deleteUserDTOs(int id) {
//		// TODO Auto-generated method stub
//		dao.deleteById(id);;
//	}
//
//}
