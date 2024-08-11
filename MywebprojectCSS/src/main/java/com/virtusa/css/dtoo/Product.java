package com.virtusa.css.dtoo;

public class Product {
	private int Courierid;
	private int Usereid;
	private String Sname;
	private String Saddress;
	private String Snumber;
	private String Rname;
	private String Raddress;
	private String Rnumber;
	private String courier;
	private String weight;
	private String Price;
	private String type;
	private String status;
	private String deliverydate;
	private String Orderdate;
	public int getCourierid() {
		return Courierid;
	}
	public void setCourierid(int courierid) {
		Courierid = courierid;
	}
	public int getUsereid() {
		return Usereid;
	}
	public void setUsereid(int usereid) {
		Usereid = usereid;
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
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDeliverydate() {
		return deliverydate;
	}
	public void setDeliverydate(String deliverydate) {
		this.deliverydate = deliverydate;
	}
	public String getOrderdate() {
		return Orderdate;
	}
	public void setOrderdate(String orderdate) {
		Orderdate = orderdate;
	}
	@Override
	public String toString() {
		return "Product [Courierid=" + Courierid + ", Usereid=" + Usereid + ", Sname=" + Sname + ", Saddress="
				+ Saddress + ", Snumber=" + Snumber + ", Rname=" + Rname + ", Raddress=" + Raddress + ", Rnumber="
				+ Rnumber + ", courier=" + courier + ", weight=" + weight + ", Price=" + Price + ", type=" + type
				+ ", status=" + status + ", deliverydate=" + deliverydate + ", Orderdate=" + Orderdate + "]";
	}
	
	
}
