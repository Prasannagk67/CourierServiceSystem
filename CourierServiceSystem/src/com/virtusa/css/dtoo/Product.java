package com.virtusa.css.dtoo;

public class Product {
	private String Sname;
	private String Saddress;
	private String Snumber;
	private String Rname;
	private String Raddress;
	private String Rnumber;
	private String courier;
	private int weight;
	public Product(String sname, String saddress, String snumber, String rname, String raddress, String rnumber,
			String courier, int weight) {
		super();
		Sname = sname;
		Saddress = saddress;
		Snumber = snumber;
		Rname = rname;
		Raddress = raddress;
		Rnumber = rnumber;
		this.courier = courier;
		this.weight = weight;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getSaddress() {
		return Saddress;
	}
	public void setSaddress(String saddress) {
		Saddress = saddress;
	}
	public String getSnumber() {
		return Snumber;
	}
	public void setSnumber(String snumber) {
		Snumber = snumber;
	}
	public String getRname() {
		return Rname;
	}
	public void setRname(String rname) {
		Rname = rname;
	}
	public String getRaddress() {
		return Raddress;
	}
	public void setRaddress(String raddress) {
		Raddress = raddress;
	}
	public String getRnumber() {
		return Rnumber;
	}
	public void setRnumber(String rnumber) {
		Rnumber = rnumber;
	}
	public String getCourier() {
		return courier;
	}
	public void setCourier(String courier) {
		this.courier = courier;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Product [Sname=" + Sname + ", Saddress=" + Saddress + ", Snumber=" + Snumber + ", Rname=" + Rname
				+ ", Raddress=" + Raddress + ", Rnumber=" + Rnumber + ", courier=" + courier + ", weight=" + weight
				+ "]";
	}
	
	
	
}
