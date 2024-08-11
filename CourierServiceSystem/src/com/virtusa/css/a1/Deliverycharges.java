package com.virtusa.css.a1;

import java.util.Scanner;

public class Deliverycharges {

	public void Delichar() {
		// TODO Auto-generated method stub
		Scanner kk = new Scanner(System.in);
		System.out.println("Enter couries weight :");
		float a = kk.nextFloat();
		System.out.println("Enter kilometers :");
		float b = kk.nextFloat();
		System.out.println("Delivery charges :"+((a*5)+(b*10))+"Rs");
	}

}
