package com.virtusa.css.a1;

import java.util.ArrayList;
import java.util.Scanner;

import com.virtusa.css.dtoo.Employee;
import com.virtusa.css.service.Employeeservice;

public class Modifyemp {

	public void modify() {
		// TODO Auto-generated method stub
		int empid;
	     String empName;
	     String empmail;
	     String emppassword;
	     String empmobile;
	     Employeeservice service = new Employeeservice();
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter Empid to Change");
	     	empid = sc.nextInt();
           System.out.println("Enter New EmployeeName");
           empName = sc.next();
           System.out.println("Enter New Employee Email");
           empmail = sc.next();
           System.out.println("Enter New Employee password");
           emppassword = sc.next();
           System.out.println("Enter New Employee Mobile");
           empmobile = sc.next();
           Employee l = new Employee(empid,empName,empmail,emppassword,empmobile);
           boolean flag=service.editUser(l);
           System.out.println("Employee  was Modify successfully");
	}

}
