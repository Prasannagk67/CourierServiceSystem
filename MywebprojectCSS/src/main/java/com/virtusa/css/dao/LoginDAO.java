package com.virtusa.css.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.virtusa.css.dbutil.dbutil;
import com.virtusa.css.dtoo.Employee;
import com.virtusa.css.dtoo.Login;




public class LoginDAO {


    public boolean validateUser(Login l) {
    	boolean status = false;

        try {

              Connection con=dbutil.getConnection();
    String cmd="select * from login where email=? and pwd=?";

      PreparedStatement ps= con.prepareStatement(cmd);


      ps.setString(1, l.getEmail());
      ps.setString(2, l.getPassWord());
      ResultSet rs = ps.executeQuery();
      status = rs.next();


        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return status;

    }




    public boolean addUser(Login l) {

            try {

              Connection con=dbutil.getConnection();
              String cmd="insert into login" + "(useridd,username,pwd,email,address,mobilenumber) values" + "(?,?,?,?,?,?)";
             PreparedStatement ps= con.prepareStatement(cmd);
             ps.setInt(1,l.getUserid() );
             ps.setString(2,l.getUserName() );
             ps.setString(3, l.getPassWord());
             ps.setString(4, l.getEmail());
             ps.setString(5, l.getAddress());
             ps.setString(6, l.getMobilenumber());

             ps.executeUpdate();
             ps.close();
             return true;


                }
            catch(Exception e) {
                e.printStackTrace();
            }

            return false;


    }
    public ArrayList<Login> getLoginUsers(){


        try {

            ArrayList<Login> loginList= new ArrayList<Login>();

            Connection con=dbutil.getConnection();
            String cmd="select * from login";
           PreparedStatement ps= con.prepareStatement(cmd);

           ResultSet rs=ps.executeQuery();

           while(rs.next()) {
        	   int Userid=rs.getInt(2);
               String UerName= rs.getString(3);
               String PassWord= rs.getString(4);
               String Email = rs.getString(5);
               String Address= rs.getString(6);
               String Mobilenumber = rs.getString(7);
               Login ln = new Login(Userid,UerName,PassWord,Email,Address,Mobilenumber);

               loginList.add(ln);


           }
      rs.close();
      ps.close();
            return loginList;

        }

        catch(Exception e) {

        }


        return null;

    }
    public boolean validateemp(Employee l) {
    	boolean status = false;

        try {

              Connection con=dbutil.getConnection();
    String cmd="select * from emp where empmail=? and emppwd=?";

      PreparedStatement ps= con.prepareStatement(cmd);


      ps.setString(1, l.getEmpmail());
      ps.setString(2, l.getEmppassword());
      ResultSet rs = ps.executeQuery();
      status = rs.next();


        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return status;

    }
 
}
