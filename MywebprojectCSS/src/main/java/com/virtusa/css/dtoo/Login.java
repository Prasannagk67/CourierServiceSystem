package com.virtusa.css.dtoo;

public class Login {
	private int Userid;
	private String userName;
	private String passWord;
	private String Email;
	private String Address;
	private String Mobilenumber;
	public Login() {
		super();
	}
	public Login(int userid, String userName, String passWord, String email, String address, String mobilenumber) {
		super();
		Userid = userid;
		this.userName = userName;
		this.passWord = passWord;
		Email = email;
		Address = address;
		Mobilenumber = mobilenumber;
	}
	public int getUserid() {
		return Userid;
	}
	public void setUserid(int userid) {
		Userid = userid;
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
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getMobilenumber() {
		return Mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		Mobilenumber = mobilenumber;
	}
	@Override
	public String toString() {
		return "Login [Userid=" + Userid + ", userName=" + userName + ", passWord=" + passWord + ", Email=" + Email
				+ ", Address=" + Address + ", Mobilenumber=" + Mobilenumber + "]";
	}
	
	

	
	
}
