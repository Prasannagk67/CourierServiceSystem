<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="com.virtusa.css.dtoo.Product"%>
<%@ page import="com.virtusa.css.dao.ProductDAO"%>
<%@ page import="java.util.*"%>
<html>
<head>
<link rel="stylesheet" href="insert.css">
<link rel="stylesheet" href="home.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="header">
  <a href="#default" class="logo">Courier Service System</a>
  <div class="header-right">
    <a class="active" href="Employeemode.html">Home</a>
    <a href="Login.html">Logout</a>
  </div>
<form>
<%
//UserBean user = new UserBean();
ProductDAO dao = new ProductDAO();
List<Product> userList = dao.getAllUsers();
//Iterator<UserBean> itr = userList.iterator();
%>
<table style="width:100%">
<tr>
<th>Courierddddddddddddd ID</th>
<th>User ID</th>
<th>Sender Name</th>
<th>Sender address</th>
<th>Sender number</th>
<th>Receiver Name</th>
<th>Receiver address</th>
<th>Receiver number</th>
<th>Courier</th>
<th>Weight</th>
<th>Price</th>
<th>Type</th>
<th>Status</th>
<th>Excepected Delivery date</th>
<th>Order Delivery date</th>
</tr>
<tr>
<%
/*while(itr.hasNext())
{
System.out.println(user.getId());*/
for (Product user : userList) {
%>
<td><%=user.getCourierid()%></td>
<td><%=user.getUsereid()%></td>
<td><%=user.getSname()%></td>
<td><%=user.getSaddress()%></td>
<td><%=user.getSnumber()%></td>
<td><%=user.getRname()%></td>
<td><%=user.getRaddress()%></td>
<td><%=user.getRnumber()%></td>
<td><%=user.getCourier()%></td>
<td><%=user.getWeight()%></td>
<td><%=user.getPrice()%></td>
<td><%=user.getType()%></td>
<td><%=user.getStatus()%></td>
<td><%=user.getDeliverydate()%></td>
<td><%=user.getOrderdate()%></td>
<td><a
href="productcontroller?action=editform&courierid=<%=user.getCourierid()%>">Update</a></td>
<td><a href="productcontroller?action=delete&courierid=<%=user.getCourierid()%>">Delete</a></td>

</tr>
<%
}
//}
%>
</form>
</body>
</html>
