package com.virtusa.css.dao;

import java.util.ArrayList;

import com.virtusa.css.dtoo.Login;

public interface ILogin {

	    public boolean validateUser(Login l);
	    public boolean addUser(Login l);
	    public ArrayList<Login> getLoginUsers();

	    public boolean modifyUser(Login l);

	    public boolean removeUser(String username);


	    public Login searchUser(String uname);

	 
	
}
