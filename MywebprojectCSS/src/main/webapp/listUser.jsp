<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="com.virtusa.css.dtoo.UserBean"%>
<%@ page import="com.virtusa.css.dao.UserDao"%>
<%@ page import="java.util.*"%>
<html>
<head>
<link rel="stylesheet" href="userlisst.css">
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
UserDao dao = new UserDao();
List<UserBean> userList = dao.getAllUsers();
//Iterator<UserBean> itr = userList.iterator();
%>
<table style="width:100%">
<tr>
<th>UserId</th>
<th>UserName</th>
<th>Password</th>
<th>Email</th>
<th>Address</th>
<th>MobileNumber</th>
<th>Date And Time</th>
</tr>
<tr>
<%
/*while(itr.hasNext())
{
System.out.println(user.getId());*/
for (UserBean user : userList) {
%>
<td><%=user.getUserid()%></td>
<td><%=user.getUsername()%></td>
<td><%=user.getPassword()%></td>
<td><%=user.getEmail()%></td>
<td><%=user.getAddress()%></td>
<td><%=user.getMobile()%></td>
<td><%=user.getDatetime()%></td>
<td><a href="Usercontroller?action=editform&userId=<%=user.getUserid()%>">Update</a></td>
<td><a href="Usercontroller?action=delete&userId=<%=user.getUserid()%>">Delete</a></td>

</tr>
<%
}
//}
%>
</table>
</body>
</html>