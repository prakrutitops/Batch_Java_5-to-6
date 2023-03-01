<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
	
	  if(email==null||email.trim().equals(""))
	    {  
	    	out.print("<p>Please enter Email!</p>");  
	    }
	 else
		{
			
		 Class.forName("com.mysql.jdbc.Driver");
 		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/webwing","root","");  
		 
 		PreparedStatement ps=con.prepareStatement("select * from signup where email like '"+email+"%'");  
		 
 		ResultSet set = ps.executeQuery();
 		
 		if(!set.isBeforeFirst()) 
  		{      
 			out.println("<p>No Record Found!</p>");   
		}
 		else
 		{
 			out.print("<table border='1' cellpadding='2' width='100%'>");  
			out.print("<tr><th>Id</th><th>FName</th><th>LName</th><th>Email</th><th>Mobile</th><th>Pass</th></tr>");  
			while(set.next())
			{  
				out.print("<tr><td>"+set.getString(1)+"</td><td>"+set.getString(2)+"</td><td>"+set.getString(3)+"</td><td>"+set.getString(4)+"</td><td></tr>");  
			}  
			out.print("</table>");  
 		}
 		
		 }
	
	%>

</body>
</html>