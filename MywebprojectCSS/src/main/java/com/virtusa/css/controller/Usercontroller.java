package com.virtusa.css.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.virtusa.css.dao.UserDao;
import com.virtusa.css.dtoo.UserBean;


/**
 * Servlet implementation class Usercontroller
 */
@WebServlet("/Usercontroller")
public class Usercontroller extends HttpServlet {    
	private static final long serialVersionUID = 1L;
		private static String INSERT = "/user.jsp";
	    private static String Edit = "/edit.jsp";
	    private static String UserRecord = "/listUser.jsp";
	    private UserDao dao;

	    public Usercontroller() {
	        super();
	        dao = new UserDao();
	    }
	    /**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    	response.setContentType("text/html");
	        String redirect="";
	        String uId = request.getParameter("userid");        
	        String action = request.getParameter("action");
	        if(!((uId)== null) && action.equalsIgnoreCase("insert"))
	        {
	        	int id = Integer.parseInt(uId);
	        	UserBean user = new UserBean();
	        	user.setUserid(id);
	            user.setUsername(request.getParameter("username"));
	            user.setPassword(request.getParameter("pwd"));
	            user.setEmail(request.getParameter("email"));
	            user.setAddress(request.getParameter("address"));
	            user.setMobile(request.getParameter("mobilenumber"));
	        	dao.addUser(user);
	        	redirect = UserRecord;
	            request.setAttribute("users", dao.getAllUsers());    
	           	System.out.println("Record Added Successfully");
	        }
	        else if (action.equalsIgnoreCase("delete")){
	            String userId = request.getParameter("userId");
	            int uid = Integer.parseInt(userId);
	            dao.removeUser(uid);
	            redirect = UserRecord;
	            request.setAttribute("users", dao.getAllUsers());
	            System.out.println("Record Deleted Successfully");
	        }else if (action.equalsIgnoreCase("editform")){        	
	        	redirect = Edit;            
	        } else if (action.equalsIgnoreCase("edit")){
	        	String userId = request.getParameter("userId");
	            int uid = Integer.parseInt(userId);            
	            UserBean user = new UserBean();
	            user.setUserid(uid);
	            user.setUsername(request.getParameter("username"));
	            user.setPassword(request.getParameter("pwd"));
	            user.setEmail(request.getParameter("email"));
	            user.setAddress(request.getParameter("address"));
	            user.setMobile(request.getParameter("mobilenumber"));
	            user.setDatetime(request.getParameter("dateandtime"));
	            dao.editUser(user);
	            request.setAttribute("user", user);
	            redirect = UserRecord;
	            System.out.println("Record updated Successfully");
	         } else if (action.equalsIgnoreCase("listUser")){
	            redirect = UserRecord;
	            request.setAttribute("users", dao.getAllUsers());
	         } else {
	            redirect = INSERT;
	        }

	        RequestDispatcher rd = request.getRequestDispatcher(redirect);
	        rd.forward(request, response);
	    }

	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        doGet(request, response);
	    }
	}