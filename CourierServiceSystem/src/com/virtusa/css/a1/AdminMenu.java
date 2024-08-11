package com.virtusa.css.a1;

import java.util.Scanner;

public class AdminMenu {

	public void admin() {
		// TODO Auto-generated method stub
		Scanner ht = new Scanner(System.in);
		
		boolean flag = false;
		int ch=0;
		while(ch!=5) {
			System.out.println("\t Admin Menu");
			System.out.println("1.Add Employee");
			System.out.println("2.View Employees");
			System.out.println("3.Delete Employee");
			System.out.println("4.Modify Employee");
			System.out.println("5.View Products for verify");
			System.out.println("6.Add Courier for delivery");
			System.out.println("7.View Courier");
			System.out.println("8.Delete Courier");
			System.out.println("9.Modify Courier");
			System.out.println("10.GO Back");
			ch=ht.nextInt();
			switch(ch) {
			case 1:
				Addemp yy = new Addemp();
				yy.addemp();
				break;
			case 2:
				Viewemp ss = new Viewemp();
				ss.viewemp();
				break;
			case 3:
				Deleteemp jj = new Deleteemp();
				jj.removeUser();
				break;
			case 4:
				Modifyemp ii = new Modifyemp();
				ii.modify();
				break;
			case 5:
				Productsverify ll = new Productsverify();
				ll.productsverify();
			break;
			case 6:
				Addcourier kk = new Addcourier();
				kk.Addcourier();
				break;
			case 7:
				Viewcourier ww = new Viewcourier();
				ww.viewcourier();
				break;
			case 8:
				Delatecourier gg = new Delatecourier();
				gg.delatecourier();
				break;
			case 9:
				Modifycourier dd = new Modifycourier();
				dd.modifycourier();
				break;
			case 10:MainMenuCSS.main(null);
	}

}
}
}