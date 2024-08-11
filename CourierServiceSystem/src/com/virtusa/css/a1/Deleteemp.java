package com.virtusa.css.a1;


import java.util.Scanner;

import com.virtusa.css.dao.EmployeeDAO;
import com.virtusa.css.service.Employeeservice;

public class Deleteemp {

	public void removeUser() {
		// TODO Auto-generated method stub
		//Delete
		 int empid;
	     Employeeservice service = new Employeeservice();
		 Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID To Delete: ");
		empid = sc.nextInt();
		boolean flag=service.removeUser(empid);
		 System.out.println("Record is deleted");
	}

}
