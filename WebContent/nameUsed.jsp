<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Name <%= request.getParameter("name")%> is already in use.</title>
</head>
<body>
	<h1>Name <%= request.getParameter("name")%> is already in use.</h1>
	<p>Please enter a different username.</p>
<form action="${pageContext.request.contextPath}/createAccountServ" method="post">
		User Name:<br> <input type="text" name="name"> <br>
		Password:<br> <input type="text" name="password"> <br>
		<br> <input type="submit" value="Create">

	</form>


</body>
</html>