<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="com.virtusa.css.dtoo.Employee"%>
<%@ page import="com.virtusa.css.dao.EmployeeDAO"%>
<html>
<head>
<link rel="stylesheet" href="editemp.css">
<link rel="stylesheet" href="home.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit User</title>
</head>
<div class="header">
  <a href="#default" class="logo">Courier Service System</a>
  <div class="header-right">
    <a class="active" href="Adminmode.html">Home</a>
    <a href="Emplist.jsp">Back</a>
    <a href="Login.html">Logout</a>
  </div>
<form>
<body>
<%
Employee user = new Employee();
%>
<%
EmployeeDAO dao = new EmployeeDAO();
%>
<form method="POST" action=employeecontroller name="frmEditUser">
<input type="hidden" name="action" value="edit" /> <%
String uid = request.getParameter("empid");
if (!((uid) == null)) {
int id = Integer.parseInt(uid);
user = dao.getUserByempid(id);
%>
<table>
<tr>
<td>User ID</td>
<td><input type="text" name="empid" readonly="readonly"
value="<%=user.getEmpid()%>"></td>
</tr>
<tr>
<td>Full Name</td>
<td><input type="text" name="empname" value="<%=user.getEmpName()%>" /></td>
</tr>
<tr>
<td>Email</td>
<td><input type="text" name="empmail" value="<%=user.getEmpmail()%>"/></td>
</tr>
<tr>
<td>Password</td>
<td><input type="text" name="emppwd" value="<%=user.getEmppassword()%>" /></td>
</tr>
<tr>
<td>Mobile</td>
<td><input type="text" name="empmobile" value="<%=user.getEmpmobile()%>" /></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Update" /></td>
</tr>
</table>
<%
} else
out.println("ID Not Found");
%>
</form>
</body>
</html>