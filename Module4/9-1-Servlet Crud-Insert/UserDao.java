import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao 
{
	
	public static Connection getconnect()
	{
		Connection con = null;
		
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				con= DriverManager.getConnection("jdbc:mysql://localhost:3306/servletcrud","root","");
			}
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return con;
	}
	
	public static int savedata(Model m)
	{
		int status =0;
		
		Connection con = UserDao.getconnect();
		
		String sql = "insert into info (fullname,email,password) values(?,?,?)";
		try 
		{
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1,m.getFullname());
			ps.setString(2,m.getEmail());
			ps.setString(3,m.getPassword());
			
			status = ps.executeUpdate();
			
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
}
