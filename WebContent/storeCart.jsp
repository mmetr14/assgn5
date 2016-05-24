<%@page import="AccountManager.Item"%>
<%@page import="AccountManager.storeManager"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shopping Cart</title>
</head>
<body>
	<h1>Shopping Cart</h1>

	<form action="cartServlet" method="post">
		<ul>
			<%
				double totalPrice = 0;
				storeManager sm = (storeManager) application.getAttribute("storeManager");
				cart thisCart = (cart) session.getAttribute("cart");
				ArrayList<Item> lst = sm.getItemsByIDs(thisCart.listItems());
				for (int i = 0; i < lst.size(); i++) {
					Item curItem = lst.get(i);
					int quantity = thisCart.getQuantity(curItem.id);
					totalPrice += (quantity * curItem.price);
					out.print("<li> <input type ='number' value='" + quantity + "' name='" + curItem.id + "'>"
							+ curItem.name + ", " + curItem.price + "</li>");
				}
			%>



		</ul>
		//Total: $
		<%=totalPrice%><input type="submit" value="Update Cart" />

	</form>
	<a href="/storeHomePage">Continue Shopping</a>
</body>
</html>