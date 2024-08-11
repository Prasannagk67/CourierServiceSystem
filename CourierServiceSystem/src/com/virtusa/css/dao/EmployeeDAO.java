package com.virtusa.css.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.css.dtoo.Employee;
import com.virtusa.dbutil.dbutil;

public class EmployeeDAO {
	private static Connection conn;

    public EmployeeDAO() {
    	conn = dbutil.getConnection();
    }

    public boolean addUser(Employee employee) {
        try {
        	String sql = "INSERT INTO emp(empid, empname,empmail,emppwd,empmobile)" +
    		" VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, employee.getEmpid());
            ps.setString(2, employee.getEmpName());
            ps.setString(3, employee.getEmpmail());
            ps.setString(4, employee.getEmppassword());
            ps.setString(5, employee.getEmpmobile());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
		return false;
    }
	public static boolean removeUser(int empid) {
        try {
        	String sql = "DELETE FROM emp WHERE empid=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, empid);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
		return false;
      }

    public boolean editUser(Employee employee) {    	
    	try {
    		String sql = "UPDATE emp SET empname=?, empmail=?, emppwd=?, empmobile=?" +
            " WHERE empid=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, employee.getEmpName());
            ps.setString(2, employee.getEmpmail());
            ps.setString(3, employee.getEmppassword());
            ps.setString(4, employee.getEmpmobile());
            ps.setInt(5, employee.getEmpid());
            ps.executeUpdate();            

        } catch (SQLException e) {
            e.printStackTrace();
        }
		return false;
    }
    
    public  ArrayList<Employee> getemployeelist() {
        try {

            ArrayList<Employee> all=new ArrayList<Employee>();

        Connection con=dbutil.getConnection();
        String cmd="select * from emp";
        PreparedStatement ps= con.prepareStatement(cmd);

        ResultSet rs=ps.executeQuery();
        while(rs.next()) {
            int empid=rs.getInt(1);
            String empName=rs.getString(2);
            String empmail=rs.getString(3);
            String emppassword=rs.getString(4);
            String empmobile=rs.getString(5);
            Employee lg=new Employee(empid,empName,empmail,emppassword,empmobile);
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

    public Employee getUserByempid(int empid) {
    	Employee employee = new Employee();
        try {
        	String sql = "SELECT * FROM emp WHERE empid=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, empid);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
            	employee.setEmpid(rs.getInt("empid"));
                employee.setEmpName(rs.getString("empname"));
                employee.setEmpmail(rs.getString("empmail"));
                employee.setEmppassword(rs.getString("emppwd"));
                employee.setEmpmobile(rs.getString("empmobile"));;                           
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }

}
