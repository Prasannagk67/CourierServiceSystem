package com.virtusa.css.a1;

import java.util.Scanner;

public class MainMenuCSS {
	public static void main(String args[] ) {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		int ch=0;
		while(ch!=4) {
			System.out.println("\t Main Menu");
			System.out.println("1.User");
			System.out.println("2.Admin");
			System.out.println("3.Employee");
			System.out.println("4.Exit");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				UserMenu ht = new UserMenu();
				ht.user();
				break;
			case 2:
				AdminMenu tr = new AdminMenu();
				tr.admin();
				break;
			case 3:
				Employeemenu lk = new Employeemenu();
				lk.employeemenu();
			case 4:
				System.exit(0);
			 default:
		     System.out.println("Sorry you choice wrong option! Plz try again");
				
			}
		}
	}
}
