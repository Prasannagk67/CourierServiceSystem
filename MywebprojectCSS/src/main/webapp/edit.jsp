<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="com.virtusa.css.dtoo.UserBean"%>
<%@ page import="com.virtusa.css.dao.UserDao"%>
<%@ page import="java.util.*"%>
<html>
<head>
<link rel="stylesheet" href="edituser.css">
<link rel="stylesheet" href="home.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit User</title>
</head>
<body>
<div class="header">
  <a href="#default" class="logo">Courier Service System</a>
  <div class="header-right">
    <a class="active" href="Adminmode.html">Home</a>
    <a href="listUser.jsp">Back</a>
    <a href="Login.html">Logout</a>
  </div>
<form>
<%
UserBean user = new UserBean();
%>
<%
UserDao dao = new UserDao();
%>
<form action='Usercontroller' name="frmEditUser"><input
type="hidden" name="action" value="edit" /> <%
String uid = request.getParameter("userId");
if (!((uid) == null)) {
int id = Integer.parseInt(uid);
user = dao.getUserById(id);
%>
<table>
<tr>
<td>User ID</td>
<td><input type="text" name="userId" readonly="readonly"
value="<%=user.getUserid()%>"></td>
</tr>
<tr>
<td>Username</td>
<td><input type="text" name="username" placeholder="<%=user.getUsername()%>" /></td>
</tr>
<tr>
<td>Password</td>
<td><input type="text" name="pwd" placeholder="<%=user.getPassword()%>"/></td>
</tr>
<tr>
<td>Email</td>
<td><input type="text" name="email"placeholder="<%=user.getEmail()%>" /></td>
</tr>
<tr>
<td>Address</td>
<td><input type="text" name="address" placeholder="<%=user.getAddress()%>" /></td>
</tr>
<tr>
<td>Mobile</td>
<td><input type="text" name="mobilenumber" placeholder="<%=user.getMobile()%>"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Update"/></td>
</tr>
</table>
<%
} else
out.println("ID Not Found");
%>
</form>
</body>
</html>