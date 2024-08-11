package com.virtusa.css.service;
import java.util.List;

import com.virtusa.css.dto.LoginDTO;
import com.virtusa.css.dto.UserDTO;
import com.virtusa.css.exception.ExceptionHandling;
public interface IUserService{
	public UserDTO createUser(UserDTO user);
	public UserDTO updateUser(UserDTO user);
	public UserDTO getUser(int userId);
	public void deleteUser(int userId);
	public List<UserDTO> getAllUser();
	UserDTO getUsers(int id) throws ExceptionHandling;
	String updateUsers(UserDTO userdto) throws ExceptionHandling;
}



//package com.virtusa.css.service;
//
//import java.util.List;
//
//import com.virtusa.css.dto.UserDTO;
//
//
//public interface IUserService {
//	//to save user
//	public UserDTO saveUserDTO(UserDTO user);
//	
//	//to update user
//	public UserDTO updateUserDTO(UserDTO user);
//	
//	//to fetch all user from database
//	public List<UserDTO> findAllUserDTOs();
//	
//	//to delete user
//	public void deleteUserDTOs(int id);
//}
