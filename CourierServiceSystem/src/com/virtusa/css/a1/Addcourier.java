package com.virtusa.css.a1;

import java.util.Scanner;

import com.virtusa.css.dtoo.Courier;
import com.virtusa.css.service.Courierservice;

public class Addcourier {

	public void Addcourier() {
		// TODO Auto-generated method stub
		 int Deliveryproductid;
		 String Deliveryproductname;
		 String Deliveryproductweight;
		 String Sendername;
		 String Senderaddress;
		 String Sendernumber;
		 String Receivername;
		 String Receiveraddress;
		 String Receivernumber;
		 String Orderdate;
		 String Deliverydate;
		 String Deliveryprice;
		 String Deliverytype;
		 String Deliverystatus;
	     Courierservice service = new Courierservice();
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter Empid");
	       Deliveryproductid = sc.nextInt();
           System.out.println("Enter Courier");
           Deliveryproductname = sc.next();
           System.out.println("Enter Courier Weightr");
           Deliveryproductweight = sc.next();
           System.out.println("Enter Sender Name");
           Sendername = sc.next();
           System.out.println("Enter Sender address");
           Senderaddress = sc.next();
           System.out.println("Enter Sender Number");
           Sendernumber = sc.next();
           System.out.println("Enter Reciever Name");
           Receivername = sc.next();
           System.out.println("Enter Reciever address");
           Receiveraddress = sc.next();
           System.out.println("Enter Reciever Number");
           Receivernumber = sc.next();
           System.out.println("Enter Orderdate");
           Orderdate = sc.next();
           System.out.println("Enter Deliverydate");
           Deliverydate = sc.next();
           System.out.println("Enter Deliveryprice");
           Deliveryprice = sc.next();
           System.out.println("Enter Deliverytype");
           Deliverytype = sc.next();
           System.out.println("Enter Deliverystatus");
           Deliverystatus = sc.next();
           Courier l = new Courier(Deliveryproductid,Deliveryproductname,Deliveryproductweight,Sendername,Senderaddress,Sendernumber,Receivername,Receiveraddress,Receivernumber,Orderdate,Deliverydate,Deliveryprice,Deliverytype,Deliverystatus);
           boolean flag=service.addcourier(l);
           System.out.println("Courier  was added successfully");
}

	}
