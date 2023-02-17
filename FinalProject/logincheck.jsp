<%@page import="com.dao.UserDao"%>
<%@page import="com.model.SignupModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
<%

	
	String email = request.getParameter("email");
	String password = request.getParameter("password");

	SignupModel m2 = new SignupModel();
	m2.setEmail(email);
	m2.setPassword(password);
	
	SignupModel m  = UserDao.LoginCheck(m2);
	
	if(m!=null)
	{
		session.setAttribute("webwing", true);
		session.setAttribute("myemail", email);
		response.sendRedirect("home.jsp");
		
	}
	else
	{
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}
	
%>

</body>
</html>