<%@page import="com.model.SignupModel"%>
<%@page import="com.model.WishlistModel"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<jsp:useBean id="product12" class="com.model.WishlistModel"></jsp:useBean>
<jsp:setProperty property="*" name="product12"/>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>

	<%
		int status123 = UserDao.WishInsert(product12);
		out.print(product12.getProduct_name());
		out.print(status123);
		
		
		//
		
		//System.out.println(status123);
		
	/* 	if (status123 > 0) 
		{
			out.print("<a href='wishlist.jsp'>Click here to show details for all wishlist detail</a>");
		}
		else 
		{
			out.print("fail");
		} */
		%>
		
		




<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>