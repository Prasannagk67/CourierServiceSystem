package com.virtusa.css.a1;

import java.util.Scanner;

import com.virtusa.css.service.Courierservice;

public class Delatecourier {

	public void delatecourier() {
		// TODO Auto-generated method stub
		 int deliveryproductid;
	     Courierservice service = new Courierservice();
		 Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product ID To Delete: ");
		deliveryproductid = sc.nextInt();
		boolean flag=service.removecourier(deliveryproductid);
		 System.out.println("Record is deleted");
	}

}
