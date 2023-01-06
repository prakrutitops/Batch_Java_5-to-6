import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet
{
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			//super.doPost(req, resp);
			
				resp.setContentType("text/html");
				PrintWriter out =resp.getWriter();
			
				String name = req.getParameter("name");
				String email = req.getParameter("email");
				String subject = req.getParameter("subject");
				String message = req.getParameter("message");
				
				//System.out.println("Welcome "+name);
				out.print("Details Are: "+"\n Your Name : \n "+name+"\n Your Email : ]n "+email+"\n Your Subject :"+subject+"\n Your Message :"+message);
				
				if(name.equals("shubham"))
				{
					resp.sendRedirect("https://www.google.com");
				}
				else
				{
					out.print("Your Name is not right");
				}
				
			
		}
}
