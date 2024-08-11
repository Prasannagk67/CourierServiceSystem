package com.virtusa.css.a1;

import java.util.ArrayList;

import com.virtusa.css.dtoo.Courier;
import com.virtusa.css.service.Courierservice;


public class Viewcourier {

	public void viewcourier() {
		// TODO Auto-generated method stub
		Courierservice service = new Courierservice();
		  ArrayList<Courier> al=service.getcourierlist();

        for(Courier l:al)
          System.out.println(l);
	}

}
