package com.virtusa.css.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.crypto.Data;

import org.hibernate.annotations.SQLInsert;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="courier_tbl")
@Table(name="courier_tbl")
public class CourierDTO {
	@Id
	@Column(name="courierid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int courierId;
	@Column(name="sname",length = 50)
	String senderName;
	@Column(name="saddress",length = 50)
	String senderAddress;
	@Column(name="snumber",length = 50)
	String senderNumber;
	@Column(name="rname",length = 50)
	String recevierName;
	@Column(name="raddress",length = 50)
	String recevierAddress;
	@Column(name="rnumber",length = 50)
	String recevierNumber;
	@Column(name="courier",length = 50)
	String courier;
	@Column(name="weight",length = 50)
	String weight;
	@Column(name="type",length = 50)
	String type;
	@Column(name="price",length = 50)
	String price;
	@Column(name="status",length = 50)
	String status;
	@Column(name="orderdate")
	Date orderDate = new Date(System.currentTimeMillis());
	@Column(name="deliverydate",length = 50)
	String deliveryDate;
	@Column(name="empid")
	int empId;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "userid")
	private UserDTO userdto;
	public CourierDTO() {
	}
public CourierDTO(int courierId, String senderName, String senderAddress, String senderNumber, String recevierName,
		String recevierAddress, String recevierNumber, String courier, String weight, String type, String price,
		String status, Date orderDate, String deliveryDate, int empId, UserDTO userdto) {
	super();
	this.courierId = courierId;
	this.senderName = senderName;
	this.senderAddress = senderAddress;
	this.senderNumber = senderNumber;
	this.recevierName = recevierName;
	this.recevierAddress = recevierAddress;
	this.recevierNumber = recevierNumber;
	this.courier = courier;
	this.weight = weight;
	this.type = type;
	this.price = price;
	this.status = status;
	this.orderDate = orderDate;
	this.deliveryDate = deliveryDate;
	this.empId = empId;
	this.userdto = userdto;
}
public int getCourierId() {
	return courierId;
}
public void setCourierId(int courierId) {
	this.courierId = courierId;
}
public String getSenderName() {
	return senderName;
}
public void setSenderName(String senderName) {
	this.senderName = senderName;
}
public String getSenderAddress() {
	return senderAddress;
}
public void setSenderAddress(String senderAddress) {
	this.senderAddress = senderAddress;
}
public String getSenderNumber() {
	return senderNumber;
}
public void setSenderNumber(String senderNumber) {
	this.senderNumber = senderNumber;
}
public String getRecevierName() {
	return recevierName;
}
public void setRecevierName(String recevierName) {
	this.recevierName = recevierName;
}
public String getRecevierAddress() {
	return recevierAddress;
}
public void setRecevierAddress(String recevierAddress) {
	this.recevierAddress = recevierAddress;
}
public String getRecevierNumber() {
	return recevierNumber;
}
public void setRecevierNumber(String recevierNumber) {
	this.recevierNumber = recevierNumber;
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
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Date getOrderDate() {
	return orderDate;
}
public void setOrderDate(Date orderDate) {
	this.orderDate = orderDate;
}
public String getDeliveryDate() {
	return deliveryDate;
}
public void setDeliveryDate(String deliveryDate) {
	this.deliveryDate = deliveryDate;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public UserDTO getUserdto() {
	return userdto;
}
public void setUserdto(UserDTO userdto) {
	this.userdto = userdto;
}
@Override
public String toString() {
	return "CourierDTO [courierId=" + courierId + ", senderName=" + senderName + ", senderAddress=" + senderAddress
			+ ", senderNumber=" + senderNumber + ", recevierName=" + recevierName + ", recevierAddress="
			+ recevierAddress + ", recevierNumber=" + recevierNumber + ", courier=" + courier + ", weight=" + weight
			+ ", type=" + type + ", price=" + price + ", status=" + status + ", orderDate=" + orderDate
			+ ", deliveryDate=" + deliveryDate + ", empId=" + empId + ", userdto=" + userdto + "]";
}		
}