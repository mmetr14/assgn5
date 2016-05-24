<%@page import="AccountManager.Item"%>
<%@page import="AccountManager.storeManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
	storeManager sm = (storeManager) application.getAttribute("storeManager");
	Item item = sm.getItem(request.getParameter("ItemID"));
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><%=item.name%></title>
</head>
<body>
	<h1>
		<%=item.name%>
	</h1>
	<img src="<%="/store-images/" + item.image%>" alt="<%=item.name%>">


	<form action="cartServlet" method="post">
		$<%=item.price%>
		<input name="productID" type="hidden" value="<%=item.id%>" /> <input
			type="submit" value="Add to cart" />
	</form>

</body>
</html>