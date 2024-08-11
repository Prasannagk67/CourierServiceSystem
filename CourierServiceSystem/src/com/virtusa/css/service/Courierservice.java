package com.virtusa.css.service;

import java.util.ArrayList;

import com.virtusa.css.dao.CourierDAO;
import com.virtusa.css.dtoo.Courier;

public class Courierservice {
	CourierDAO dao;
	public boolean addcourier(Courier l) {
	    dao= new CourierDAO();
	    boolean flag=dao.addcourier(l);
	    return flag;
	    }
	public boolean removecourier(int l) {
	    dao= new CourierDAO();
	    boolean flag=dao.removecourier(l);
	    return flag;
	    }
	 public ArrayList<Courier> getcourierlist(){

	        dao= new CourierDAO();

	        ArrayList<Courier> al=dao.getcourierlist();
	        return al;

	    }
	 public boolean modifycourier(Courier l) {
		    dao= new CourierDAO();
		    boolean flag=dao.modifycourier(l);
		    return flag;
		    }
}
