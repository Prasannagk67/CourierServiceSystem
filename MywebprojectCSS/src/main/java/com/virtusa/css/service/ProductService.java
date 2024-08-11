package com.virtusa.css.service;

import com.virtusa.css.dao.ProductDAO;
import com.virtusa.css.dtoo.Product;

public class ProductService {
	ProductDAO dao;
	public boolean addUser(Product l) {
	    dao= new ProductDAO();
	    boolean flag=dao.addUser(l);
	    return flag;
	    }

}
