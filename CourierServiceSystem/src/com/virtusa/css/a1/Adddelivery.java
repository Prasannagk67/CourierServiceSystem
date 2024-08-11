package com.virtusa.css.a1;
import java.util.Scanner;
import com.virtusa.css.dtoo.Product;
import com.virtusa.css.service.Productservice;
public class Adddelivery {
	public void adddelivery() {
		// TODO Auto-generated method stub
		int op=0;
		String Sname;
        String Saddress;
        String Snumber;
        String Rname;
        String Raddress;
        String Rnumber;
        String courier;
        int weight;
        Productservice service = new Productservice();
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter sname");
            Sname = sc.next();
            System.out.println("Enter saddress");
            Saddress = sc.next();
            System.out.println("Enter snumber");
            Snumber = sc.next();
            System.out.println("Enter Rname");
            Rname = sc.next();
            System.out.println("Enter Raddress");
            Raddress = sc.next();
            System.out.println("Enter Rnumber");
            Rnumber = sc.next();
            System.out.println("Enter Courier");
            courier = sc.next();
            System.out.println("Enter Weight");
            weight = sc.nextInt();
            Product l = new Product(Sname,Saddress,Snumber,Rname,Raddress,Rnumber,courier,weight);
            boolean flag=service.addUser(l);
            System.out.println("Your product was added successfully");
        }
        
        
}	



