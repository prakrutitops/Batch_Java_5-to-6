import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveServlet extends HttpServlet
{
	
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			//super.doPost(req, resp);
		
			
			resp.setContentType("text/html");//
			PrintWriter out = resp.getWriter();//web page data print
			
			
			String fullname = req.getParameter("fullname");
			String email = req.getParameter("email");
			String pass = req.getParameter("password");
			String cpass = req.getParameter("confirm");
			
			
			Model m = new Model();
			m.setFullname(fullname);
			m.setEmail(email);
			m.setPassword(pass);
			m.setConfirm_password(cpass);
			
			int data = UserDao.savedata(m);
			
			if(data>0)
			{
				out.print("Inserted");
			}
			else
			{
				out.print("Fail");
			}
			
			
			
		
		}
	
}
