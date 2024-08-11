package com.virtusa.css.a1;

import java.util.ArrayList;

import com.virtusa.css.dtoo.Employee;
import com.virtusa.css.service.Employeeservice;

public class Viewemp {

	public void viewemp() {
		// TODO Auto-generated method stub
		Employeeservice service = new Employeeservice();
		  ArrayList<Employee> al=service.getemployeelist();

          for(Employee l:al)
            System.out.println(l);
	}

}
