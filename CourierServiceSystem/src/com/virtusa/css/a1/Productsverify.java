package com.virtusa.css.a1;

import java.util.ArrayList;

import com.virtusa.css.dtoo.Product;
import com.virtusa.css.service.Productservice;



public class Productsverify {

	public void productsverify() {
		// TODO Auto-generated method stub
		Productservice service = new Productservice();
		  ArrayList<Product> al=service.getproductlist();

        for(Product l:al)
          System.out.println(l);
	}

}
