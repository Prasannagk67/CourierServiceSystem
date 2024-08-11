package com.virtusa.css.service;
import com.virtusa.css.dao.EmployeeDAO;
import com.virtusa.css.dao.LoginDAO;
import com.virtusa.css.dtoo.Employee;
import com.virtusa.css.dtoo.Login;

public class EmployeeService {
	EmployeeDAO dao;
	public boolean addUser(Employee l) {
	    dao= new EmployeeDAO();
	    boolean flag=dao.addUser(l);
	    return flag;
	    }
}
