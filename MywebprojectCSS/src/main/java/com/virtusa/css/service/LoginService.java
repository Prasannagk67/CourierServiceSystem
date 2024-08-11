package com.virtusa.css.service;
 
import java.util.ArrayList;
 
import com.virtusa.css.dao.LoginDAO;
import com.virtusa.css.dtoo.Login;

 
public class LoginService {


    LoginDAO dao;

    public boolean validateUser(Login l) {
        dao= new LoginDAO();

        boolean flag=dao.validateUser(l);
        return flag;

    }


    public boolean addUser(Login l) {
    dao= new LoginDAO();
    boolean flag=dao.addUser(l);
    return flag;

    }


    public ArrayList<Login> getLoginUsers(){

        dao= new LoginDAO();

        ArrayList<Login> al=dao.getLoginUsers();
        return al;

    }


//	public boolean removeUser(Login l) {
//		 dao= new LoginDAO();
//		    boolean flag=dao.removeUser(l);
//		    return flag;
//		
//	}
 
}