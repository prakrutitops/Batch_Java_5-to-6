import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewServlet extends HttpServlet 
{
	
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			//super.doGet(req, resp);
		
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			
			
			
			List<Model>list = UserDao.viewdata();
			
			out.print("<table border='1'>");
			
			out.print("<tr>");
			
			out.print("<th>Id</th> <th>Name</th><th>Email</th><th>Password</th>");
			out.print("</tr>");
			for(Model m:list)
			{
				
				out.print("<tr>");
				out.print("<td>"+m.getId()+"</td> <td>"+m.getFullname()+"</td><td>"+m.getEmail()+"</td><td>"+m.getPassword()+"</td>");	
				out.print("</tr>");	
				
			}
			
			out.print("</table>");
			
			
		}
	
}
