<%@page import="com.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <jsp:useBean id="product12" class="com.model.WishlistModel"></jsp:useBean>
    <jsp:setProperty property="*" name="product12"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="header.jsp"></jsp:include>
</head>
<body>

			<h1>WishList</h1>


		<%
		
		int status123 = UserDao.WishInsert(product12);
		
		//System.out.println(status123);
		
		if (status123 > 0) 
		{
			
			out.print("<a href='wishlistview.jsp'>Items Added Succesfully for View Wishlist detail CLick here </a>");
		}
		else 
		{
			out.print("fail");
		}
		%>



</body>
<jsp:include page="footer.jsp"></jsp:include>
</html>