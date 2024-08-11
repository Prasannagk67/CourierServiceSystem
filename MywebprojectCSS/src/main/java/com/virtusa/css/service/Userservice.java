package com.virtusa.css.service;
import com.virtusa.css.dao.UserDao;
import com.virtusa.css.dtoo.UserBean;

public class Userservice {
	UserDao dao;
	public boolean addUser(UserBean l) {
	    dao= new UserDao();
	    boolean flag=dao.addUser(l);
	    return flag;
	    }
}
