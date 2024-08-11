package com.virtusa.css.dtoo;

public class UserBean {
	private int Userid;
	private String Username;
    private String Password;
    private String Email;
    private String Address;
    private String Mobile;
    String Datetime;
	public int getUserid() {
		return Userid;
	}
	public void setUserid(int userid) {
		Userid = userid;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
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
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getDatetime() {
		return Datetime;
	}
	public void setDatetime(String datetime) {
		Datetime = datetime;
	}
	@Override
	public String toString() {
		return "UserBean [Userid=" + Userid + ", Username=" + Username + ", Password=" + Password + ", Email=" + Email
				+ ", Address=" + Address + ", Mobile=" + Mobile + ", Datetime=" + Datetime + "]";
	}
	
}
