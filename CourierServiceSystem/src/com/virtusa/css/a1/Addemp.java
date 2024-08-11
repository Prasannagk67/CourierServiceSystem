package com.virtusa.css.a1;

import java.util.Scanner;

import com.virtusa.css.dtoo.Employee;
import com.virtusa.css.service.Employeeservice;

public class Addemp {

	public void addemp() {
		// TODO Auto-generated method stub
		     int empid;
		     String empName;
		     String empmail;
		     String emppassword;
		     String empmobile;
		     Employeeservice service = new Employeeservice();
		     Scanner sc = new Scanner(System.in);
		     System.out.println("Enter Empid");
		     	empid = sc.nextInt();
	            System.out.println("Enter EmployeeName");
	            empName = sc.next();
	            System.out.println("Enter Employee Email");
	            empmail = sc.next();
	            System.out.println("Enter Employee password");
	            emppassword = sc.next();
	            System.out.println("Enter Employee Mobile");
	            empmobile = sc.next();
	            Employee l = new Employee(empid,empName,empmail,emppassword,empmobile);
	            boolean flag=service.addUser(l);
	            System.out.println("Employee  was added successfully");
	}

}
