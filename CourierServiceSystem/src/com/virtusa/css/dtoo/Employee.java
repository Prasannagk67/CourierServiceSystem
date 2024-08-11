package com.virtusa.css.dtoo;

public class Employee {
    private int empid;
    private String empName;
    private String empmail;
    private String emppassword;
    private String empmobile;
	public Employee(int empid, String empName, String empmail, String emppassword, String empmobile) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empmail = empmail;
		this.emppassword = emppassword;
		this.empmobile = empmobile;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpmail() {
		return empmail;
	}
	public void setEmpmail(String empmail) {
		this.empmail = empmail;
	}
	public String getEmppassword() {
		return emppassword;
	}
	public void setEmppassword(String emppassword) {
		this.emppassword = emppassword;
	}
	public String getEmpmobile() {
		return empmobile;
	}
	public void setEmpmobile(String empmobile) {
		this.empmobile = empmobile;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empmail=" + empmail + ", emppassword="
				+ emppassword + ", empmobile=" + empmobile + "]";
	}
    
}
