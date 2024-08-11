<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="adddelivery.css">
<link rel="stylesheet" href="home.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New User</title>
</head>
<body>
<div class="header">
  <a href="#default" class="logo">Courier Service System</a>
  <div class="header-right">
    <a class="active" href="usermode.jsp">Home</a>
    <a href="usermode.jsp">Back</a>
    <a href="Login.html">Logout</a>
  </div>
<form action='productcontroller' name="frmAddUser">
<input type="hidden" name="action" value="insert" />
<p><b>Add New Record</b></p>
<table>
<tr>
<td>Enetr User Id</td>
<td><input type="text" name="useridd"/></td>
</tr>
<tr>
<td>Sender Name</td>
<td><input type="text" name="sname" /></td>
</tr>
<tr>
<td>Sender Address</td>
<td><input type="text" name="saddress" /></td>
</tr>
<tr>
<td>Sender Number</td>
<td><input type="text" name="snumber" /></td>
</tr>
<tr>
<td>Receiver Name</td>
<td><input type="text" name="rname" /></td>
</tr>
<tr>
<td>Receiver Address</td>
<td><input type="text" name="raddress" /></td>
</tr>
<tr>
<td>Receiver Number</td>
<td><input type="text" name="rnumber" /></td>
</tr>
<tr>
<td>Courier</td>
<td><input type="text" name="courier" /></td>
</tr>
<tr>
<td>Weight</td>
<td><input type="text" name="weight" /></td>
</tr>
<tr>
<td>Courier Type</td>
<td><input type="text" name="type" /></td>
</tr>
<tr>
<td>Courier Status</td>
<td><input type="text" name="status" /></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Submit" /></td>
</tr>
</table>
</form>
</body>
</html>