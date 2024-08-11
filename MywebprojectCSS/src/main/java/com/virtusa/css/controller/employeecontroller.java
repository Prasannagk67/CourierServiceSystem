package com.virtusa.css.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.css.dao.EmployeeDAO;
import com.virtusa.css.dtoo.Employee;

/**
 * Servlet implementation class employeecontroller
 */
@WebServlet("/employeecontroller")
public class employeecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static String INSERT = "/Addemp.jsp";
    private static String Edit = "/Editemp.jsp";
    private static String UserRecord = "/Emplist.jsp";
    private EmployeeDAO dao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public employeecontroller() {
        super();
        dao = new EmployeeDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        String redirect="";
        String uId = request.getParameter("empid");        
        String action = request.getParameter("action");
        if(!((uId)== null) && action.equalsIgnoreCase("insert"))
        {
        	int id = Integer.parseInt(uId);
        	Employee user = new Employee();
        	user.setEmpid(id);
            user.setEmpName(request.getParameter("empname"));
            user.setEmpmail(request.getParameter("empmail"));
            user.setEmppassword(request.getParameter("emppwd"));
            user.setEmpmobile(request.getParameter("empmobile"));
        	dao.addUser(user);
        	redirect = UserRecord;
            request.setAttribute("users", dao.getAllUsers());
        }
        else if (action.equalsIgnoreCase("delete")){
            String Empid = request.getParameter("empid");
            int uid = Integer.parseInt(Empid);
            dao.removeUser(uid);
            redirect = UserRecord;
            request.setAttribute("users", dao.getAllUsers());
        }else if (action.equalsIgnoreCase("editform")){        	
        	redirect = Edit;            
        } else if (action.equalsIgnoreCase("edit")){
        	String Empid = request.getParameter("empid");
            int uid = Integer.parseInt(Empid);            
            Employee user = new Employee();
        	user.setEmpid(uid);
            user.setEmpName(request.getParameter("empname"));
            user.setEmpmail(request.getParameter("empmail"));
            user.setEmppassword(request.getParameter("emppwd"));
            user.setEmpmobile(request.getParameter("empmobile"));
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
