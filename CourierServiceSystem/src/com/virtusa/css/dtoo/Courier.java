package com.virtusa.css.dtoo;

public class Courier {
	private int Deliveryproductid;
	private String Deliveryproductname;
	private String Deliveryproductweight;
	private String Sendername;
	private String Senderaddress;
	private String Sendernumber;
	private String Receivername;
	private String Receiveraddress;
	private String Receivernumber;
	private String Orderdate;
	private String Deliverydate;
	private String Deliveryprice;
	private String Deliverytype;
	private String Deliverystatus;
	public Courier(int deliveryproductid, String deliveryproductname, String deliveryproductweight, String sendername,
			String senderaddress, String sendernumber, String receivername, String receiveraddress,
			String receivernumber, String orderdate, String deliverydate, String deliveryprice, String deliverytype,
			String deliverystatus) {
		super();
		Deliveryproductid = deliveryproductid;
		Deliveryproductname = deliveryproductname;
		Deliveryproductweight = deliveryproductweight;
		Sendername = sendername;
		Senderaddress = senderaddress;
		Sendernumber = sendernumber;
		Receivername = receivername;
		Receiveraddress = receiveraddress;
		Receivernumber = receivernumber;
		Orderdate = orderdate;
		Deliverydate = deliverydate;
		Deliveryprice = deliveryprice;
		Deliverytype = deliverytype;
		Deliverystatus = deliverystatus;
	}
	public int getDeliveryproductid() {
		return Deliveryproductid;
	}
	public void setDeliveryproductid(int deliveryproductid) {
		Deliveryproductid = deliveryproductid;
	}
	public String getDeliveryproductname() {
		return Deliveryproductname;
	}
	public void setDeliveryproductname(String deliveryproductname) {
		Deliveryproductname = deliveryproductname;
	}
	public String getDeliveryproductweight() {
		return Deliveryproductweight;
	}
	public void setDeliveryproductweight(String deliveryproductweight) {
		Deliveryproductweight = deliveryproductweight;
	}
	public String getSendername() {
		return Sendername;
	}
	public void setSendername(String sendername) {
		Sendername = sendername;
	}
	public String getSenderaddress() {
		return Senderaddress;
	}
	public void setSenderaddress(String senderaddress) {
		Senderaddress = senderaddress;
	}
	public String getSendernumber() {
		return Sendernumber;
	}
	public void setSendernumber(String sendernumber) {
		Sendernumber = sendernumber;
	}
	public String getReceivername() {
		return Receivername;
	}
	public void setReceivername(String receivername) {
		Receivername = receivername;
	}
	public String getReceiveraddress() {
		return Receiveraddress;
	}
	public void setReceiveraddress(String receiveraddress) {
		Receiveraddress = receiveraddress;
	}
	public String getReceivernumber() {
		return Receivernumber;
	}
	public void setReceivernumber(String receivernumber) {
		Receivernumber = receivernumber;
	}
	public String getOrderdate() {
		return Orderdate;
	}
	public void setOrderdate(String orderdate) {
		Orderdate = orderdate;
	}
	public String getDeliverydate() {
		return Deliverydate;
	}
	public void setDeliverydate(String deliverydate) {
		Deliverydate = deliverydate;
	}
	public String getDeliveryprice() {
		return Deliveryprice;
	}
	public void setDeliveryprice(String deliveryprice) {
		Deliveryprice = deliveryprice;
	}
	public String getDeliverytype() {
		return Deliverytype;
	}
	public void setDeliverytype(String deliverytype) {
		Deliverytype = deliverytype;
	}
	public String getDeliverystatus() {
		return Deliverystatus;
	}
	public void setDeliverystatus(String deliverystatus) {
		Deliverystatus = deliverystatus;
	}
	@Override
	public String toString() {
		return "Courier [Deliveryproductid=" + Deliveryproductid + ", Deliveryproductname=" + Deliveryproductname
				+ ", Deliveryproductweight=" + Deliveryproductweight + ", Sendername=" + Sendername + ", Senderaddress="
				+ Senderaddress + ", Sendernumber=" + Sendernumber + ", Receivername=" + Receivername
				+ ", Receiveraddress=" + Receiveraddress + ", Receivernumber=" + Receivernumber + ", Orderdate="
				+ Orderdate + ", Deliverydate=" + Deliverydate + ", Deliveryprice=" + Deliveryprice + ", Deliverytype="
				+ Deliverytype + ", Deliverystatus=" + Deliverystatus + "]";
	}
	
	
}
