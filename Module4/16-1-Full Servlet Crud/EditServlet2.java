import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditServlet2 extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String id = req.getParameter("id");
		int id2 = Integer.parseInt(id);
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		
		Model m =new Model();
		
		m.setId(id2);
		m.setFullname(name);
		m.setEmail(email);
		m.setPassword(pass);
		
		
		int status = UserDao.updatedata(m);
		
		if(status>0)
		{
			resp.sendRedirect("ViewServlet");
		}
		else
		{
			resp.sendRedirect("404.html");
		}
		
	
	}
}
