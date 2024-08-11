<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="com.virtusa.css.dtoo.Product"%>
<%@ page import="com.virtusa.css.dao.ProductDAO"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit User</title>
</head>
<body>
<%
Product user = new Product();
%>
<%
ProductDAO dao = new ProductDAO();
%>
<form action=Deliverycontroller name="frmEditUser">
<input type="hidden" name="action" value="edit" /> <%
String uid = request.getParameter("courierid");
if (!((uid) == null)) {
String id = String.valueOf(uid);
user = dao.getUserBysname(id);
%>
<table>
<tr>
<td>Courier Id</td>
<td><input type="text" name="courierid" readonly="readonly"
value="<%=user.getCourierid()%>"></td>
</tr>
<tr>
<td>User ID</td>
<td><input type="text" name="useridd" value="<%=user.getUsereid()%>" /></td>
</tr>
<tr>
<td>Sender Name</td>
<td><input type="text" name="sname" value="<%=user.getSname()%>" /></td>
</tr>
<tr>
<td>Sender Address</td>
<td><input type="text" name="saddress" value="<%=user.getSaddress()%>"/></td>
</tr>
<tr>
<td>Sender Mobile</td>
<td><input type="text" name="sname" value="<%=user.getSnumber()%>" /></td>
</tr>
<tr>
<td>Receiver Name</td>
<td><input type="text" name="rname" value="<%=user.getRname()%>" /></td>
</tr>
<tr>
<td>Receiver Address</td>
<td><input type="text" name="raddress" value="<%=user.getRaddress()%>" /></td>
</tr>
<tr>
<td>Receiver Number</td>
<td><input type="text" name="rname" value="<%=user.getRnumber()%>"/></td>
</tr>
<tr>
<td>Courier</td>
<td><input type="text" name="courier" value="<%=user.getCourier()%>" /></td>
</tr>
<tr>
<td>Weight</td>
<td><input type="text" name="weight" value="<%=user.getWeight()%>" /></td>
</tr>
<tr>
<td>Price</td>
<td><input type="text" name="price" value="<%=user.getPrice()%>"/></td>
</tr>
<tr>
<td>Type</td>
<td><input type="text" name="type" value="<%=user.getType()%>" /></td>
</tr>
<tr>
<td>Status</td>
<td><input type="text" name="status" value="<%=user.getStatus()%>" /></td>
</tr>
<tr>
<td>Delivery Date</td>
<td><input type="text" name="deliverydate" value="<%=user.getDeliverydate()%>" /></td>
</tr>
<tr>
<td>Order Date</td>
<td><input type="text"value="<%=user.getOrderdate()%>"/></td>
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