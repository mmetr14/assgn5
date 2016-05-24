<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Please Try Again</title>
</head>
<body>

	<p>Either your username or password is incorrect.Please try again.</p>
<form action="${pageContext.request.contextPath}/LoginServ" method="post">
		User Name:<br> <input type="text" name="name"> <br>
		Password:<br> <input type="text" name="password"> <br>
		<br> <input type="submit" value="Login">

	</form>


	<a href="createAccount.jsp">Create New Account </a>
</body>
</html>