package com.virtusa.css.service;

import java.util.ArrayList;

import com.virtusa.css.dao.EmployeeDAO;
import com.virtusa.css.dtoo.Employee;

public class Employeeservice {
	EmployeeDAO dao;
	public boolean addUser(Employee l) {
	    dao= new EmployeeDAO();
	    boolean flag=dao.addUser(l);
	    return flag;
	    }
	public boolean removeUser(int l) {
	    dao= new EmployeeDAO();
	    boolean flag=dao.removeUser(l);
	    return flag;
	    }
	   public ArrayList<Employee> getemployeelist(){

	        dao= new EmployeeDAO();

	        ArrayList<Employee> al=dao.getemployeelist();
	        return al;

	    }
	   public boolean editUser(Employee l) {
		    dao= new EmployeeDAO();
		    boolean flag=dao.editUser(l);
		    return flag;
		    }

}
