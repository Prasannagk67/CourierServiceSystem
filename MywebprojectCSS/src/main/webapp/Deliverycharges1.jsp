<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="DeliveryCharges.css">
<link rel="stylesheet" href="home.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="header">
  <a href="#default" class="logo">Courier Service System</a>
  <div class="header-right">
    <a class="active" href="usermode.jsp">Home</a>
        <a href="usermode.jsp">Back</a>
    <a href="Login.html">Logout</a>
  </div>
<form action="chargescal" method="post">
       <tr>
           <td><p style="color:white;">Enter couries weight </p></td>
           <td><input type="text" name="no1"></td>
       </tr>
       
       <tr>
           <td><p style="color:white;">Enter kilometers</p></td>
           <td><input type="text" name="no2"></td>
       </tr>
       
       <tr>
           <td><input type="submit" value="Calculate Charges"></td>
       </tr>



<%
   String result=(String)request.getAttribute("result");
%>

<%
    if(result!=null)
    {
%>
		<p style="color:white;">Delivery Charges : <span style="color:white;"><%=result %> Rs</p>

<%
    }
%>
</form>
</body>
</html>