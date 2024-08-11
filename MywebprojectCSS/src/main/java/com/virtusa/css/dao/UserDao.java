package com.virtusa.css.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.css.dbutil.dbutil;
import com.virtusa.css.dtoo.UserBean;

public class UserDao {

	    private Connection conn;

	    public UserDao() {
	    	conn = dbutil.getConnection();
	    }

	    public boolean addUser(UserBean userBean) {
	        try {
	        	String sql = "INSERT INTO login(userid, username,pwd,email,address,mobilenumber)" +
	    		" VALUES (?, ?, ?, ?, ?, ? )";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            
	            ps.setInt(1, userBean.getUserid());
	            ps.setString(2, userBean.getUsername());
	            ps.setString(3, userBean.getPassword());  
	            ps.setString(2, userBean.getEmail());
	            ps.setString(3, userBean.getAddress());
	            ps.setString(3, userBean.getMobile());
	            ps.executeUpdate();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
			return false;
	    }

	    public void removeUser(int userId) {
	        try {
	        	String sql = "DELETE FROM login WHERE userid=?";
	            PreparedStatement ps = conn
	                    .prepareStatement(sql);
	            ps.setInt(1, userId);
	            ps.executeUpdate();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	      }

	    public void editUser(UserBean userBean) {    	
	    	try {
	    		String sql = "UPDATE login SET username=?, pwd=?, email=?, address=?, mobilenumber=?" +
	            " WHERE userid=?";
	            PreparedStatement ps = conn
	                    .prepareStatement(sql);
	            
	            ps.setString(1, userBean.getUsername());
	            ps.setString(2, userBean.getPassword());  
	            ps.setString(3, userBean.getEmail());
	            ps.setString(4, userBean.getAddress());
	            ps.setString(5, userBean.getMobile());            
	            ps.setInt(6, userBean.getUserid());
	            ps.executeUpdate();            

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    public List getAllUsers() {
	        List users = new ArrayList();
	        try {
	        	String sql = "SELECT * FROM login";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            while (rs.next()) {
	                UserBean userBean = new UserBean();
	                userBean.setUserid(rs.getInt("userid"));
	                userBean.setUsername(rs.getString("username"));
	                userBean.setPassword(rs.getString("pwd"));
	                userBean.setEmail(rs.getString("email"));
	                userBean.setAddress(rs.getString("address"));
	                userBean.setMobile(rs.getString("mobilenumber"));
	                userBean.setDatetime(rs.getString("dateandtime"));
	                users.add(userBean);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return users;
	    }

	    public UserBean getUserById(int userId) {
	    	UserBean userBean = new UserBean();
	        try {
	        	String sql = "SELECT * FROM login WHERE userid=?";
	            PreparedStatement ps = conn.
	                    prepareStatement(sql);
	            ps.setInt(1, userId);
	            ResultSet rs = ps.executeQuery();

	            if (rs.next()) {
	            	userBean.setUserid(rs.getInt("userid"));
	                userBean.setUsername(rs.getString("username"));
	                userBean.setPassword(rs.getString("pwd"));
	                userBean.setEmail(rs.getString("email"));
	                userBean.setAddress(rs.getString("address"));
	                userBean.setMobile(rs.getString("mobilenumber"));                           
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return userBean;
	    }
	}