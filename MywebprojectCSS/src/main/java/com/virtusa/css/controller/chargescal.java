package com.virtusa.css.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class chargescal
 */
@WebServlet("/chargescal")
public class chargescal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public chargescal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String number1=request.getParameter("no1");
		String number2=request.getParameter("no2");
		
		int no1=Integer.parseInt(number1);
		int no2=Integer.parseInt(number2);
		
		int sum=(no1*5)+(no2*10);
		
		String result=String.valueOf(sum);
		
		request.setAttribute("result",result);
		RequestDispatcher rd=request.getRequestDispatcher("Deliverycharges.jsp");
		rd.forward(request, response);
	}

}
