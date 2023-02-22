<%@page import="com.model.SignupModel"%>
<%@page import="com.dao.UserDao"%>
<%@page import="com.model.WishlistModel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>


	<%
		
			SignupModel m2 =new SignupModel();
			String email = (String)request.getSession().getAttribute("myemail");
			m2.setEmail(email);
	
		List<WishlistModel> list = UserDao.getallwishdetail(m2);
		request.setAttribute("pl", list);
			
		%>
		
		<c:forEach items="${pl}" var="list1">
			<center>
				
					<br>
					<br>
					
					<p>
						<h2>${list1.getProduct_name()}</h2>
					</p>
					
					<p>
						<img width="500px" height="200px" src="${list1.getProduct_image()}">
					</p>
					
					<%-- <p>
						<h3>${list.getProduct_price()}</h3>
					</p> --%>
			
				<%-- 	<p>
						<h4>${list.getProduct_description()}</h4>
					</p> --%>
			
					<%-- <p>
					
					<a class="swd-button"  href="addtocart.jsp?id=${m.getId()}">Add To Cart</a>
					<a class="swd-button"  href="wishlist.jsp?id=${m.getId()}">Add To WishList</a>
				</p> --%>
				
			<%-- 	<p>
					
					<a class="swd-button"  href="addtocart.jsp?id=${list.getId()}">Add To Cart</a>
					<a class="swd-button"  href="wishlistadd.jsp?id=${list.getId()}">Add To WishList</a>
				</p> --%>
			</center>
		
		</c:forEach>
		



<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>