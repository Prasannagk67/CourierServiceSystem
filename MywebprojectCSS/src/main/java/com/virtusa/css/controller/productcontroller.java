package com.virtusa.css.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.virtusa.css.dao.ProductDAO;
import com.virtusa.css.dtoo.Product;

/**
 * Servlet implementation class productcontroller
 */
@WebServlet("/productcontroller")
public class productcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static String INSERT = "/adddelivery.jsp";
    private static String Edit = "/edituserproduct.jsp";
    private static String UserRecord = "/insert.jsp";
    private ProductDAO dao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productcontroller() {
        super();
        dao = new ProductDAO();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        String redirect="";
        String target = "";
        String uId = request.getParameter("sname");        
        String action = request.getParameter("action");
        if(!((uId)== null) && action.equalsIgnoreCase("insert"))
        {
        	String Sname = request.getParameter("sname");
        	String uid = String.valueOf(Sname);
        	Product user = new Product();
        	 user.setUsereid(Integer.parseInt(request.getParameter("useridd")));
            user.setSname(request.getParameter("sname"));
            user.setSaddress(request.getParameter("saddress"));
            user.setSnumber(request.getParameter("snumber"));
            user.setRname(request.getParameter("rname"));
            user.setRaddress(request.getParameter("raddress"));
            user.setRnumber(request.getParameter("rnumber"));
            user.setCourier(request.getParameter("courier"));
            user.setWeight(request.getParameter("weight"));
            user.setPrice(request.getParameter("price"));
            user.setType(request.getParameter("type"));
            user.setStatus(request.getParameter("status"));
            user.setDeliverydate(request.getParameter("deliverydate"));
        	dao.addUser(user);
			JFrame frame = new JFrame("Swing Tester");
		      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JOptionPane.showMessageDialog(frame, "Courier Added");
        	redirect = INSERT;
            request.setAttribute("users", dao.getAllUsers());
        }
        else if (action.equalsIgnoreCase("delete")){
            String Courierid = request.getParameter("courierid");
            int uid = Integer.parseInt(Courierid);
            dao.removeUser(uid);
            redirect = "insert.jsp";
            request.setAttribute("users", dao.getAllUsers());
        }else if (action.equalsIgnoreCase("editform")){        	
        	redirect = Edit;            
        } else if (action.equalsIgnoreCase("edit")){
        	String Courierid = request.getParameter("courierid");
            int uid = Integer.parseInt(Courierid);            
            Product user = new Product();
        	user.setCourierid(uid);         
       	 user.setUsereid(Integer.parseInt(request.getParameter("useridd")));
         user.setSname(request.getParameter("sname"));
         user.setSaddress(request.getParameter("saddress"));
         user.setSnumber(request.getParameter("snumber"));
         user.setRname(request.getParameter("rname"));
         user.setRaddress(request.getParameter("raddress"));
         user.setRnumber(request.getParameter("rnumber"));
         user.setCourier(request.getParameter("courier"));
         user.setWeight(request.getParameter("weight"));
         user.setPrice(request.getParameter("price"));
         user.setType(request.getParameter("type"));
         user.setStatus(request.getParameter("status"));
         user.setDeliverydate(request.getParameter("deliverydate"));
            dao.editUser(user);
            request.setAttribute("user", user);
            redirect = UserRecord;
         } else if (action.equalsIgnoreCase("listUser")){
            redirect = UserRecord;
            request.setAttribute("users", dao.getAllUsers());
         } else {
            redirect = INSERT;
        }

        RequestDispatcher rd = request.getRequestDispatcher(redirect);
        rd.forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
