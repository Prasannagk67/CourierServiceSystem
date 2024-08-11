package com.virtusa.css.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.virtusa.css.dtoo.Courier;
import com.virtusa.dbutil.dbutil;


public class CourierDAO {
    public CourierDAO() {
    }
    public boolean addcourier(Courier deliveryproduct) {
        try {
        	Connection con=dbutil.getConnection();
        	String sql = "INSERT INTO courier(dproductid, dpname, dpweight, sname, saddress, snumber, rname, raddress, rnumber, orderdata, ddate, dprice, dtype, dstatus)" +
    		" VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, deliveryproduct.getDeliveryproductid());
            ps.setString(2, deliveryproduct.getDeliveryproductname());
            ps.setString(3, deliveryproduct.getDeliveryproductweight());
            ps.setString(4, deliveryproduct.getSendername());
            ps.setString(5, deliveryproduct.getSenderaddress());
            ps.setString(6, deliveryproduct.getSendernumber());
            ps.setString(7, deliveryproduct.getReceivername());
            ps.setString(8, deliveryproduct.getReceiveraddress());
            ps.setString(9, deliveryproduct.getReceivernumber());
            ps.setString(10, deliveryproduct.getOrderdate());
            ps.setString(11, deliveryproduct.getDeliverydate());
            ps.setString(12, deliveryproduct.getDeliveryprice());
            ps.setString(13, deliveryproduct.getDeliverytype());
            ps.setString(14, deliveryproduct.getDeliverystatus());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return false;
    }
    public static boolean removecourier(int deliveryproductid) {
        try {
        	Connection con=dbutil.getConnection();
        	String sql = "DELETE FROM courier WHERE dproductid=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, deliveryproductid);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
		return false;
      }
    public  ArrayList<Courier> getcourierlist() {
        try {

            ArrayList<Courier> all=new ArrayList<Courier>();

        Connection con=dbutil.getConnection();
        String cmd="select * from courier";
        PreparedStatement ps= con.prepareStatement(cmd);

        ResultSet rs=ps.executeQuery();
        while(rs.next()) {
            int Deliveryproductid=rs.getInt(1);
            String Deliveryproductname=rs.getString(2);
            String Deliveryproductweight=rs.getString(3);
            String Sendername=rs.getString(4);
            String Senderaddress=rs.getString(5);
            String Sendernumber=rs.getString(6);
            String Receivername=rs.getString(7);
            String Receiveraddress=rs.getString(8);
            String Receivernumber=rs.getString(9);
            String Orderdate=rs.getString(10);
            String Deliverydate=rs.getString(11);
            String Deliveryprice=rs.getString(12);
            String Deliverytype=rs.getString(13);
            String Deliverystatus=rs.getString(14);
            Courier lg=new Courier(Deliveryproductid,Deliveryproductname,Deliveryproductweight,Sendername,Senderaddress,Sendernumber,Receivername,Receiveraddress,Receivernumber,Orderdate,Deliverydate,Deliveryprice,Deliverytype,Deliverystatus);
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
    public boolean modifycourier(Courier deliveryproduct) {    	
    	try {
    		 Connection con=dbutil.getConnection();
    		String sql = "UPDATE courier SET dpname=?, dpweight=?, sname=?, saddress=?, snumber=?, rname=?, raddress=?, rnumber=?, orderdata=?, ddate=?, dprice=?, dtype=?, dstatus=?" +
            " WHERE dproductid=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, deliveryproduct.getDeliveryproductname());
            ps.setString(2, deliveryproduct.getDeliveryproductweight());
            ps.setString(3, deliveryproduct.getSendername());
            ps.setString(4, deliveryproduct.getSenderaddress());
            ps.setString(5, deliveryproduct.getSendernumber());
            ps.setString(6, deliveryproduct.getReceivername());
            ps.setString(7, deliveryproduct.getReceiveraddress());
            ps.setString(8, deliveryproduct.getReceivernumber());
            ps.setString(9, deliveryproduct.getOrderdate());
            ps.setString(10, deliveryproduct.getDeliverydate());
            ps.setString(11, deliveryproduct.getDeliveryprice());
            ps.setString(12, deliveryproduct.getDeliverytype());
            ps.setString(13, deliveryproduct.getDeliverystatus());
            ps.setInt(14, deliveryproduct.getDeliveryproductid());
            ps.executeUpdate();            

        } catch (SQLException e) {
            e.printStackTrace();
        }
		return false;
    }
}
