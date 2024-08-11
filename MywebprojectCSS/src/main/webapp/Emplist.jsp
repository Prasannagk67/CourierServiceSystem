<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="com.virtusa.css.dtoo.Employee"%>
<%@ page import="com.virtusa.css.dao.EmployeeDAO"%>
<%@ page import="java.util.*"%>
<html>
<head>
<link rel="stylesheet" href="empllist.css">
<link rel="stylesheet" href="home.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All User</title>
</head>
<body>
<div class="header">
  <a href="#default" class="logo">Courier Service System</a>
  <div class="header-right">
    <a class="active" href="Adminmode.html">Home</a>
    <a href="Login.html">Logout</a>
  </div>
<form>
<%
//UserBean user = new UserBean();
EmployeeDAO dao = new EmployeeDAO();
List<Employee> userList = dao.getAllUsers();
//Iterator<UserBean> itr = userList.iterator();
%>
<table style="width:100%">
<tr>
<th>Employee Id</th>
<th>Employee Name</th>
<th>Employee Mail</th>
<th>Employee Password</th>
<th>Employee Mobile</th>
</tr>
<tr>
<%
/*while(itr.hasNext())
{
System.out.println(user.getId());*/
for (Employee user : userList) {
%>
<td><%=user.getEmpid()%></td>
<td><%=user.getEmpName()%></td>
<td><%=user.getEmpmail()%></td>
<td><%=user.getEmppassword()%></td>
<td><%=user.getEmpmobile()%></td>
<td><a
href="employeecontroller?action=editform&empid=<%=user.getEmpid()%>">Update</a></td>
<td><a
href="employeecontroller?action=delete&empid=<%=user.getEmpid()%>">Delete</a></td>

</tr>
<%
}
//}
%>
</table>
</center>
</body>
</html>