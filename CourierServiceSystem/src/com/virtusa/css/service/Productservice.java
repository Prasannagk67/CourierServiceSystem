package com.virtusa.css.service;

import java.util.ArrayList;
import com.virtusa.css.dao.ProductDAO;
import com.virtusa.css.dtoo.Product;
public class Productservice {
	ProductDAO dao;
	public boolean addUser(Product l) {
	    dao= new ProductDAO();
	    boolean flag=dao.addUser(l);
	    return flag;
	    }
	public boolean checkdelivery(Product l) {
        dao= new ProductDAO();
        boolean flag=dao.checkdelivery(l);
        return flag;
	}
	 public ArrayList<Product> getproductlist(){

	        dao= new ProductDAO();

	        ArrayList<Product> al=dao.getproductlist();
	        return al;

	    }
}
