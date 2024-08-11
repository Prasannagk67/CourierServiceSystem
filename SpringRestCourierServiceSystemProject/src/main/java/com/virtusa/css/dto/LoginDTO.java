package com.virtusa.css.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="login_details")
public class LoginDTO {
	@Id
	@Column(name="loginid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int loginId;
	@Column(name="username",length = 30)
	String userName;
	@Column(name="password",length = 30)
	String passWord;
	public LoginDTO() {
	}
	public LoginDTO(int loginId, String userName, String passWord) {
		super();
		this.loginId = loginId;
		this.userName = userName;
		this.passWord = passWord;
	}
	public int getLoginId() {
		return loginId;
	}
	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		return "LoginDTO [loginId=" + loginId + ", userName=" + userName + ", passWord=" + passWord + "]";
	}
}
