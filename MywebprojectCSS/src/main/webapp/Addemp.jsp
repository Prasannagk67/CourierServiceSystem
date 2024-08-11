<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="addemp.css">
<link rel="stylesheet" href="home.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New User</title>
</head>
<body>
<div class="header">
  <a href="#default" class="logo">Courier Service System</a>
  <div class="header-right">
    <a class="active" href="Adminmode.html">Home</a>
    <a href="Login.html">Logout</a>
  </div>
<form action='employeecontroller' name="frmAddUser">
<input type="hidden" name="action" value="insert" />
<p><b>Add New Employee Details</b></p>
<table>
<tr>
<td>User ID</td>
<td><input type="text" name="empid" /></td>
</tr>
<tr>
<td>Full Name</td>
<td><input type="text" name="empname" /></td>
</tr>
<tr>
<td>Email</td>
<td><input type="text" name="empmail" /></td>
</tr>
<tr>
<td>Password</td>
<td><input type="text" name="emppwd" /></td>
</tr>
<tr>
<td>Mobile</td>
<td><input type="text" name="empmobile" /></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Submit" /></td>
</tr>
</table>
</form>
</body>
</html>