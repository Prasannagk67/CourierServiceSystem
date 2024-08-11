package com.virtusa.css.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.virtusa.css.dtoo.Employee;
import com.virtusa.css.dtoo.Product;
import com.virtusa.dbutil.dbutil;
public class ProductDAO {
	 public boolean addUser(Product l) {
         try {
           Connection con=dbutil.getConnection();
           String cmd="insert into product values(?,?,?,?,?,?,?,?)";
          PreparedStatement ps= con.prepareStatement(cmd);
          ps.setString(1,l.getSname() );
          ps.setString(2, l.getSaddress());
          ps.setString(3, l.getSnumber());
          ps.setString(4,l.getRname() );
          ps.setString(5, l.getRaddress());
          ps.setString(6, l.getRnumber());
          ps.setString(7, l.getCourier());
          ps.setInt(8, l.getWeight());
          ps.executeUpdate();
          ps.close();
          return true;
             }
         catch(Exception e) {
             e.printStackTrace();
         }

         return false;
 }
	 public boolean checkdelivery(Product l) {
	        try {
	              Connection con=dbutil.getConnection();
	    String cmd="select * from product where userID=? and LastName=? and FirstName=? and productname=? and Address=? and City=? and Mobilenumber=?";
	      PreparedStatement ps= con.prepareStatement(cmd);
	      ps.setString(1,l.getSname() );
          ps.setString(2, l.getSaddress());
          ps.setString(3, l.getSnumber());
          ps.setString(4,l.getRname() );
          ps.setString(5, l.getRaddress());
          ps.setString(6, l.getRnumber());
          ps.setString(7, l.getCourier());
          ps.setInt(8, l.getWeight());
	      ResultSet rs = ps.executeQuery();
	      if(rs.next())
	           return true;
	      return false;
	        }
	        catch(Exception e) {
	            e.printStackTrace();
	        }
	        return false;

	    }
	 public  ArrayList<Product> getproductlist() {
	        try {

	            ArrayList<Product> all=new ArrayList<Product>();

	        Connection con=dbutil.getConnection();
	        String cmd="select * from product";
	        PreparedStatement ps= con.prepareStatement(cmd);

	        ResultSet rs=ps.executeQuery();
	        while(rs.next()) {
	            String Sname=rs.getString(1);
	            String Saddress=rs.getString(2);
	            String Snumber=rs.getString(3);
	            String Rname=rs.getString(4);
	            String Raddress=rs.getString(5);
	            String Rnumber=rs.getString(6);
	            String courier=rs.getString(7);
	            int weight=rs.getInt(8);
	            Product lg=new Product(Sname,Saddress,Snumber,Rname,Raddress,Rnumber,courier,weight);
	            all.add(lg);
	        }
	        rs.close();
	        ps.close();
	        return all;

	    }
	        catch(Exception e) {

	        }
	        return null;
	    }
}
