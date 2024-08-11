package com.virtusa.css.dbutil;
import java.sql.Connection;
import java.sql.DriverManager;
public class dbutil {
		public static Connection getConnection() {
	        try {
	        Class.forName("com.mysql.cj.jdbc.Driver");  
	        Connection con=DriverManager.getConnection(  
	        "jdbc:mysql://localhost:3306/virtusa1","root","pass");  
	        return con;
	        }
	        catch(Exception e) {
	            e.printStackTrace();
	        }
	        return null;
	   }
	}
