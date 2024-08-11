package com.virtusa.css.dtoo;

public class Employee {

    private int Empid;
    private String EmpName;
    private String Empmail;
    private String Emppassword;
    private String Empmobile;
	public Employee() {
		super();
	}
	public Employee(int empid, String empName, String empmail, String emppassword, String empmobile) {
		super();
		Empid = empid;
		EmpName = empName;
		Empmail = empmail;
		Emppassword = emppassword;
		Empmobile = empmobile;
	}
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpmail() {
		return Empmail;
	}
	public void setEmpmail(String empmail) {
		Empmail = empmail;
	}
	public String getEmppassword() {
		return Emppassword;
	}
	public void setEmppassword(String emppassword) {
		Emppassword = emppassword;
	}
	public String getEmpmobile() {
		return Empmobile;
	}
	public void setEmpmobile(String empmobile) {
		Empmobile = empmobile;
	}
	@Override
	public String toString() {
		return "Employee [Empid=" + Empid + ", EmpName=" + EmpName + ", Empmail=" + Empmail + ", Emppassword="
				+ Emppassword + ", Empmobile=" + Empmobile + "]";
	}
    
    
}