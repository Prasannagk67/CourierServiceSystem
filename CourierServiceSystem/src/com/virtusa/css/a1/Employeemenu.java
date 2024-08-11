package com.virtusa.css.a1;

import java.util.Scanner;

public class Employeemenu {

	public void employeemenu() {
		// TODO Auto-generated method stub
		Scanner ht = new Scanner(System.in);
		
		boolean flag = false;
		int ch=0;
		while(ch!=5) {
			System.out.println("\t Employee Menu");
			System.out.println("1.View Delivery Charges");
			System.out.println("2.View Courier");
			System.out.println("3.Modify Courier");
			System.out.println("4.GO Back");
			ch=ht.nextInt();
			switch(ch) {
			case 1:
			Deliverycharges tt = new Deliverycharges();
			tt.Delichar();
			break;
			case 2:
				Viewcourier ww = new Viewcourier();
				ww.viewcourier();
				break;
			case 3:
				Modifycourier dd = new Modifycourier();
				dd.modifycourier();
				break;
			case 4:MainMenuCSS.main(null);
			}
	}

}
}