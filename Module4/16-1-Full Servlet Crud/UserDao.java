import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	
	
	public static List<Model> viewdata()
	{
		
		List<Model>list = new ArrayList<Model>();
		Connection con = UserDao.getconnect();
		
		String sql = "select * from info";
		
		
		try 
		{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet set =ps.executeQuery();
	
			
			while(set.next())
			{
				
				int id = set.getInt(1);
				String name =set.getString(2);
				String email = set.getString(3);
				String password = set.getString(4);
				
				
				Model m =new Model();
				m.setId(id);
				m.setFullname(name);
				m.setEmail(email);
				m.setPassword(password);
				list.add(m);
				
			}
			
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
	
	public static int deletedata(int id)
	{
		int status =0;
		
		Connection con = UserDao.getconnect();
		
		String sql = "delete from info where id =?";
		try 
		{
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, id);
			
			status = ps.executeUpdate();
			
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	public static Model getemployeebyid(int id)
	{
		Connection con = UserDao.getconnect();
		Model m =new Model();
		
		try
		{
			PreparedStatement ps =con.prepareStatement("select * from info where id=?");
			ps.setInt(1, id);
			
			ResultSet set = ps.executeQuery();
			
			if(set.next())
			{
				int id2 = set.getInt(1);
				String name = set.getString(2);
				String email = set.getString(3);
				String pass = set.getString(4);
				
				m.setId(id2);
				m.setFullname(name);
				m.setEmail(email);
				m.setPassword(pass);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		
		
		return m;
	}
	
	public static int updatedata(Model m)
	{
		int status =0;
		
		Connection con = UserDao.getconnect();
		
		String sql = "update info set fullname=?,email=?,password=? where id =?";
		try 
		{
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1,m.getFullname());
			ps.setString(2,m.getEmail());
			ps.setString(3,m.getPassword());
			ps.setInt(4,m.getId());
			
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
