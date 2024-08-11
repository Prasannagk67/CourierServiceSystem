package com.virtusa.css.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.virtusa.css.dao.LoginDAO;
import com.virtusa.css.dtoo.Employee;
import com.virtusa.css.dtoo.Login;
import com.virtusa.css.service.LoginService;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    
	private LoginDAO loginDAO;

    public void init() {
        loginDAO = new LoginDAO();
    }
      
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		PrintWriter pw = response.getWriter();
		int userid;
		String uname;
		String pwd;
		String email;
		String address;
		String mobilenumber;
		LoginService service = new LoginService();
		String action = request.getParameter("action");
		String target = "";
		switch(action) {
		case "Register":
			userid = Integer.parseInt(request.getParameter("userid")); 
			uname = request.getParameter("uname");
			pwd = request.getParameter("pwd");
			email = request.getParameter("email");
			address = request.getParameter("address");
			mobilenumber = request.getParameter("mobilenumber");
			Login ln = new Login(userid,uname,pwd,email,address,mobilenumber);
			boolean flag=service.addUser(ln);
			if(flag)
				target="Add.jsp";
			break;
		case "Login":
				email = request.getParameter("email");
		        pwd = request.getParameter("pwd");
		        Login login = new Login();
		        login.setEmail(email);
		        login.setPassWord(pwd);
		        
		        String empmail = request.getParameter("email");
		        String emppassword = request.getParameter("pwd");
		        Employee employee = new Employee();
		        employee.setEmpmail(empmail);
		        employee.setEmppassword(emppassword);
		        
			    if (("admin@gmail.com".equals(email) && "admin".equals(pwd))) {
			    	target="Adminmode.html";    
		
				} 
		        
			    else if (loginDAO.validateemp(employee)) {
					target="Employeemode.html";    
	
			} 
			else if (loginDAO.validateUser(login)) {
				HttpSession session = request.getSession();
				session.setAttribute("email", email);
			    target="usermode.jsp";
			}
			else {
				JFrame frame = new JFrame("Swing Tester");
			      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				JOptionPane.showMessageDialog(frame, "Wrong details");
				target="Login.html";
//				HttpSession session = request.getSession();
//				target="Loginfail.html";
			}
			break;
		case "View Delivery Charges":
			target = "Deliverycharges.jsp";
			break;
		case "Add Delivery Product":
			
			target = "Adddelivery.jsp";
			break;
		case "Add Employee":
			target = "Addemp.jsp";
			break;
		case "Employee List":
			target = "Emplist.jsp";
			break;
		case "User List":
			target = "listUser.jsp";
			break;
		case "View Delivery Product":
			target = "insert.jsp";
			break;
		case "Add Courier":
			target = "adddelivery.jsp";
			break;
		case "Track Courier":
			target = "list.html";
			break;
		case "View Couriers":
			target = "courierlist.jsp";
			break;
		case "Check Delivery Charges":
			target = "Deliverycharges1.jsp";
			break;
		}
		RequestDispatcher rd=request.getRequestDispatcher(target);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
