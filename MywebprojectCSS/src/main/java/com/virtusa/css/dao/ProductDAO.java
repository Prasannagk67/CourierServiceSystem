package com.virtusa.css.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.css.dbutil.dbutil;
import com.virtusa.css.dtoo.Product;

public class ProductDAO {
	private Connection conn;
    public ProductDAO() {
    	conn = dbutil.getConnection();
    }
    public boolean addUser(Product product) {
        try {
        	String sql = "INSERT INTO product(useridd,sname, saddress, snumber, rname, raddress, rnumber, courier, weight,price,type,status,deliverydate)" +
    		" VALUES (?,?, ?, ?, ?, ?, ?, ?, ?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, product.getUsereid());
            ps.setString(2, product.getSname());
            ps.setString(3, product.getSaddress());
            ps.setString(4, product.getSnumber());
            ps.setString(5, product.getRname());
            ps.setString(6, product.getRaddress());
            ps.setString(7, product.getRnumber());
            ps.setString(8, product.getCourier());
            ps.setString(9, product.getWeight());
            ps.setString(10, product.getPrice());
            ps.setString(11, product.getType());
            ps.setString(12, product.getStatus());
            ps.setString(13, product.getDeliverydate());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return false;
    }
    public boolean  removeUser(int Courierid) {
        try {
        	String sql = "DELETE FROM product WHERE courierid=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Courierid);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
		return false;
      }
    public boolean editUser(Product product) {    	
    	try {
    		String sql = "UPDATE product SET useridd=?,sname=?, saddress=?, snumber=?, rname=?, raddress=?, rnumber=?, courier=?, weight=?,price=?,type=?,status=?,deliverydate=?" +
            " WHERE courierid=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, product.getUsereid());
            ps.setString(2, product.getSname());
            ps.setString(3, product.getSaddress());
            ps.setString(4, product.getSnumber());
            ps.setString(5, product.getRname());
            ps.setString(6, product.getRaddress());
            ps.setString(7, product.getRnumber());
            ps.setString(8, product.getCourier());
            ps.setString(9, product.getWeight());
            ps.setString(10, product.getPrice());
            ps.setString(11, product.getType());
            ps.setString(12, product.getStatus());
            ps.setString(13, product.getDeliverydate());
            ps.setInt(14, product.getCourierid());
            ps.executeUpdate();            
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return false;
    }
    public List getAllUsers() {
        List users = new ArrayList();
        try {
        	String sql = "SELECT * FROM product";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	Product product = new Product();
            	product.setCourierid(rs.getInt("courierid"));
            	product.setUsereid(rs.getInt("useridd"));
            	product.setSname(rs.getString("sname"));
            	product.setSaddress(rs.getString("saddress"));
            	product.setSnumber(rs.getString("snumber"));
            	product.setRname(rs.getString("rname"));
            	product.setRaddress(rs.getString("raddress"));
            	product.setRnumber(rs.getString("rnumber"));
            	product.setCourier(rs.getString("courier"));
            	product.setWeight(rs.getString("weight"));
            	product.setPrice(rs.getString("price"));
            	product.setType(rs.getString("type"));
            	product.setStatus(rs.getString("status"));
            	product.setDeliverydate(rs.getString("deliverydate"));
            	product.setOrderdate(rs.getString("orderdate"));
                users.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
    public Product getUserBysname(String sname) {
    	Product product = new Product();
        try {
        	String sql = "SELECT * FROM product WHERE courierid=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sname);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	product.setCourierid(rs.getInt("courierid"));
            	product.setUsereid(rs.getInt("useridd"));
            	product.setSname(rs.getString("sname"));
            	product.setSaddress(rs.getString("saddress"));
            	product.setSnumber(rs.getString("snumber"));
            	product.setRname(rs.getString("rname"));
            	product.setRaddress(rs.getString("raddress"));
            	product.setRnumber(rs.getString("rnumber"));
            	product.setCourier(rs.getString("courier"));
            	product.setWeight(rs.getString("weight"));
            	product.setPrice(rs.getString("price"));
            	product.setType(rs.getString("type"));
            	product.setStatus(rs.getString("status"));
            	product.setDeliverydate(rs.getString("deliverydate"));
            	product.setOrderdate(rs.getString("orderdate"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }

}
