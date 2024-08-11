package com.virtusa.css.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="employee_tbl")
@Table(name="employee_tbl")
public class EmployeeDTO {
	@Id
    @Column(name="empid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int empId;
	@Column(name="empname")
	String empName;
	@Column(name="empemail")
	String empEmail;
	@Column(name="emppwd")
	String empPhone;
	@Column(name="status")
	String status;
	@OneToOne(cascade = CascadeType.ALL)
	LoginDTO login;
	public EmployeeDTO() {
	}
	public EmployeeDTO(int empId, String empName, String empEmail, String empPhone, String status, LoginDTO login) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empPhone = empPhone;
		this.status = status;
		this.login = login;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LoginDTO getLogin() {
		return login;
	}
	public void setLogin(LoginDTO login) {
		this.login = login;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", empPhone="
				+ empPhone + ", status=" + status + ", login=" + login + "]";
	}
	
}