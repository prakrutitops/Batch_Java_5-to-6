package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.model.ProductModel;
import com.model.SendEmailModel;
import com.model.SignupModel;
import com.model.WishlistModel;

public class UserDao 
{
	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webwing","root","");
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}
	
	
	public static int SignupUser(SignupModel m)
	{
		
		int status = 0;
		
		Connection con = UserDao.getconnect();
		
		String sql ="insert into signup (name,email,password) values (?,?,?)";
		try 
		{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,m.getName());
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
	
	public static SignupModel LoginCheck(SignupModel m)
	{
		boolean flag = false;
		SignupModel obj = null;
		
		try
		{
			
			Connection con = UserDao.getconnect();
			PreparedStatement ps = con.prepareStatement("select * from signup where email=? and password=?");
			ps.setString(1, m.getEmail());
			ps.setString(2, m.getPassword());
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				obj = new SignupModel();
				obj.setName(rs.getString("name"));
				obj.setEmail(rs.getString("email"));
				obj.setPassword(rs.getString("password"));

			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return obj;
	}
	
	
	public static int SendEmail(SendEmailModel m)
	{
		
		int status = 0;
		
		Connection con = UserDao.getconnect();
		
		String sql ="insert into newsletter (email) values (?)";
		try 
		{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,m.getEmail());
		
			
			
			status = ps.executeUpdate();
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
		
		
		
	}
	
	public static List<ProductModel>productview()
	{
		
		List<ProductModel>list = new ArrayList<ProductModel>();
		
		Connection con = UserDao.getconnect();
		
		
		
		try 
		{
			String sql="select * from products";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet set =ps.executeQuery();
			
			while(set.next())
			{
				
				ProductModel m =new ProductModel();
				m.setId(set.getInt(1));
				m.setProduct_name(set.getString(2));
				m.setProduct_price(set.getString(3));
				m.setProduct_description(set.getString(4));
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
	public static List<ProductModel>getallproducts()
	{
		List<ProductModel>productlist = new ArrayList<ProductModel>();
	
				
		Connection con = UserDao.getconnect();
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from products");
			ResultSet rs = (ResultSet) ps.executeQuery();
			
			while(rs.next())
			{
				ProductModel pm = new ProductModel();
				
				pm.setId(rs.getInt(1));
				pm.setProduct_name(rs.getString(2));
				pm.setProduct_price(rs.getString(3));
				pm.setProduct_description(rs.getString(4));
				pm.setProduct_image(rs.getString(5));
				productlist.add(pm);
			}
			
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return productlist;
	
	}
	
	public static WishlistModel getselectedwishdetail(int id)
	{
		WishlistModel m= new WishlistModel();
		Connection con = UserDao.getconnect();
		
		try 
		{
			PreparedStatement ps =(PreparedStatement) con.prepareStatement("select id,product_name,product_image from products where id=?");
			ps.setInt(1,id);
			ResultSet set=ps.executeQuery();
			if(set.next())
			{
				
				m.setId(set.getInt(1));
				m.setProduct_name(set.getString(2));
				m.setProduct_image(set.getString(3));
				//m.setEmail(set.getString(4));
				
				
				
			}
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return m;
		
	}
	
	public static int WishInsert(WishlistModel m) {
		
		int status = 0;

		Connection con = UserDao.getconnect();

		try {
			PreparedStatement ps = con.prepareStatement("insert into wishlist(product_name,product_image,email) values(?,?,?)");

			//ps.setInt(1, m.getId());
			ps.setString(1, m.getProduct_name());
			ps.setString(2, m.getProduct_image());
			ps.setString(3, m.getEmail());
		

			status = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return status;
	}	
	
	/*public static List<WishlistModel> getwishbyemail(String email)
	{//SELECT COUNT(product_name) FROM wishlist WHERE email ='darshit@gmail.com'

		List<WishlistModel> list = new ArrayList<WishlistModel>();
		WishlistModel d1 = new WishlistModel();
		try {
			
			Connection con = UserDao.getconnect();
			PreparedStatement ps= con.prepareStatement("Select * from wishlist where email=?");
			ps.setString(1,email);
			ResultSet rs = (ResultSet) ps.executeQuery();
			
			
			while(rs.next())
			{
				
				d1.setId(rs.getInt(1));
				d1.setProduct_name(rs.getString(2));
				d1.setProduct_image(rs.getString(3));
				list.add(d1);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return list;
	}
	*/
	
	
	
	
	public static List<WishlistModel>wishlistview()
	{
		
		List<WishlistModel>list = new ArrayList<WishlistModel>();
		
		Connection con = UserDao.getconnect();
		
		
		
		try 
		{
			String sql="select * from wishlist where email=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet set =ps.executeQuery();
			
			while(set.next())
			{
				
				WishlistModel m =new WishlistModel();
				m.setId(set.getInt(1));
				m.setProduct_name(set.getString(2));
				m.setProduct_image(set.getString(3));
				m.setEmail(set.getString(4));
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
	
	public static List<WishlistModel> getallwishdetail(SignupModel m2)
	{
		List<WishlistModel> i2 = new ArrayList<WishlistModel>();
		
		HttpServletRequest request = null;
		
		try {
			
			
			SignupModel s=new SignupModel();
			Connection con = UserDao.getconnect();
			PreparedStatement ps= con.prepareStatement("Select * from wishlist where email=? ");
			//System.out.println(m2.getEmail());
			ps.setString(1, m2.getEmail());
			ResultSet rs = (ResultSet) ps.executeQuery();
			
			while(rs.next())
			{
				WishlistModel d1 = new WishlistModel();
				//d1 = new ImageModel();
				d1.setId(rs.getInt(1));
				d1.setProduct_name(rs.getString(2));
				d1.setProduct_image(rs.getString(3));
				d1.setEmail(rs.getString(4));
				i2.add(d1);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return i2;
	}
	

	
	
	
}


