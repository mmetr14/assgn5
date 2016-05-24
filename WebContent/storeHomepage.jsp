<%@page import="AccountManager.Item"%>
<%@page import="AccountManager.storeManager"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Store</title>
</head>
<body>
	<h1>Student Store</h1>
	<p>Items available</p>
	<%
		storeManager sm = (storeManager) application.getAttribute("storeManager");
		
		ArrayList<Item> items = sm.getItems();
		for (int i = 0; i < items.size(); i++) {
			Item curItem = items.get(i);
			String str = "<li><a href= \"storeProduct.jsp?id=" + curItem.id + "\">" + curItem.name + "</a></li>";
			out.print(str);
		}
	%>
</body>
</html>