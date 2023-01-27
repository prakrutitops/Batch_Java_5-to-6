<%@page import="com.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:useBean id="m" class="com.model.Model"/>
<jsp:setProperty property="*" name="m"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
			
			int result = UserDao.updatedata(m);
			
			 if(result>0)
			{
				response.sendRedirect("index.jsp");
			}
			else
			{
				out.print("Fail");
			} 
		
		%>

</body>
</html>