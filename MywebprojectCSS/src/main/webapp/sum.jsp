<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<%!
	int find_sum(int p, int q)
	{
		return (p*5)+(q*10);
	}
%>
<%
	String inp1=request.getParameter("n1");
	String inp2=request.getParameter("n2");

	if((inp1!=null) && (inp2!=null)
)
	{
		int px=Integer.parseInt(inp1);
		int py=Integer.parseInt(inp2);

		int sum=find_sum(px, py);
		out.println("<br/>Delivery charges = " + sum);
	}
%><br><br>
<a href="Deliverycharges.jsp"> Go Back </a>
</body>
</html>
