package com.virtusa.css.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String userid=request.getParameter("useridd");
//		int name = Integer.parseInt(request.getParameter("name"));
        out.println("<html>");
        out.println("<head>");
        out.println("<<link rel=\"stylesheet\" href=\"listcourier.css\">>");
        out.println("<<link rel=\"stylesheet\" href=\"home.css\">>");
        out.println("<title>Courier List</title>");
        out.println("</head>");
        out.println("<body>");
        out.print("<div class=\"header\">");
        out.print("<a href=\"#default\" class=\"logo\">Courier Service System</a>");
        out.print("<div class=\"header-right\">");
        out.print("<a class=\"active\" href=\"usermode.jsp\">Home</a>");
        out.print("<a href=\"Login.html\">Logout</a>");
        out.print("</div>");
		 out.print("<form>");
		out.print("<table border='1' style=\"width:100%\"><tr><th>Courier ID</th><th>User ID</th><th>Sender Name</th><th>Sender Address</th><th>Sender number</th><th>Reciver Name</th><th>Sender Address</th><th>Sender Number</th><th>Courier</th><th>Weight</th><th>Price</th><th>Type</th><th>Status</th><th>Delivery Date</th><th>Order Date</th></tr>");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con=DriverManager.getConnection(  
				        "jdbc:mysql://localhost:3306/virtusa1","root","pass");
			 Statement stmt=con.createStatement();
			 ResultSet rs=stmt.executeQuery("select * from product WHERE useridd="+userid+"");
			 while(rs.next())
			 {
				 out.print("<tr><td>");
				 out.print(rs.getInt(1));
				 out.print("</td>");
				 out.print("<td>");
				 out.print(rs.getInt(2));
				 out.print("</td>");
				 out.print("<td>");
				 out.print(rs.getString(3));
				 out.print("</td>");
				 out.print("<td>");
				 out.print(rs.getString(4));
				 out.print("</td>");
				 out.print("<td>");
				 out.print(rs.getString(5));
				 out.print("</td>");
				 out.print("<td>");
				 out.print(rs.getString(6));
				 out.print("</td>");
				 out.print("<td>");
				 out.print(rs.getString(7));
				 out.print("</td>");
				 out.print("<td>");
				 out.print(rs.getString(8));
				 out.print("</td>");
				 out.print("<td>");
				 out.print(rs.getString(9));
				 out.print("</td>");
				 out.print("<td>");
				 out.print(rs.getString(10));
				 out.print("</td>");
				 out.print("<td>");
				 out.print(rs.getString(11));
				 out.print("</td>");
				 out.print("<td>");
				 out.print(rs.getString(12));
				 out.print("</td>");
				 out.print("<td>");
				 out.print(rs.getString(13));
				 out.print("</td>");
				 out.print("<td>");
				 out.print(rs.getString(14));
				 out.print("</td>");
				 out.print("<td>");
				 out.print(rs.getString(15));
				 out.print("</td>");
				 out.print("</tr>");
				 out.print("</form>");
			     out.println("</body>");
			     out.println("</html>");
			 }
		} catch (Exception p) {
			// TODO: handle exception
			System.out.println(p);
		}
		out.print("</table");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}















































//package com.virtusa.Controller;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//
//
//
//
///**
// * Servlet implementation class Servlet1
// */
//@WebServlet("/Servlet1")
//public class Servlet1 extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public Servlet1() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter out=response.getWriter();
//		String id=request.getParameter("id");
//		out.print("<h1>Display the record<h1>");
//		out.print("<table border='1'><tr><th>Id</th><th>Name</th><th>Address</th></tr>");
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			 Connection con=DriverManager.getConnection(  
//				        "jdbc:mysql://localhost:3306/search","root","pass");
//			 Statement stmt=con.createStatement();
//			 ResultSet rs=stmt.executeQuery("select * from t12 where id="+id+"");
//			 while(rs.next())
//			 {
//				 out.print("<tr><td>");
//				 out.print(rs.getInt(1));
//				 out.print("</td>");
//				 out.print("<td>");
//				 out.print(rs.getString(2));
//				 out.print("</td>");
//				 out.print("<td>");
//				 out.print(rs.getString(3));
//				 out.print("</td>");
//				 out.print("</tr>");
//			 }
//		} catch (Exception p) {
//			// TODO: handle exception
//			System.out.println(p);
//		}
//		out.print("</table");
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}
//
//}
