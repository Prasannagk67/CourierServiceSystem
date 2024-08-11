package com.virtusa.css.dto;

import java.util.ArrayList;
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

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="user_tbl")
public class UserDTO {
	@Id
	@Column(name="userid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int userId;
	@Column(name="fullname",length = 50)
	String fullName;
	@Column(name="useremail",length = 50)
	String userEmail;
	@Column(name="userphone",length = 50)
	String userPhone;
	@OneToOne(cascade = CascadeType.ALL)
	LoginDTO login;
	@OneToMany(mappedBy = "courier")
	private List<CourierDTO> courierdto;
	public UserDTO() {
	}
	public UserDTO(int userId, String fullName, String userEmail, String userPhone, LoginDTO login) {
		super();
		this.userId = userId;
		this.fullName = fullName;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.login = login;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public LoginDTO getLogin() {
		return login;
	}
	public void setLogin(LoginDTO login) {
		this.login = login;
	}
	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", fullName=" + fullName + ", userEmail=" + userEmail + ", userPhone="
				+ userPhone + ", login=" + login + "]";
	}
}