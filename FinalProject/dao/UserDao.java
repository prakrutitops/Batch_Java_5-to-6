package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
	
	public static List<WishlistModel>getallwishdetail()
	{
		List<WishlistModel>productlist = new ArrayList<WishlistModel>();
	
				
		Connection con = UserDao.getconnect();
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from wishlist where email='shubham@gmail.com'");
			ResultSet rs = (ResultSet) ps.executeQuery();
			
			while(rs.next())
			{
				WishlistModel pm = new WishlistModel();
				
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
	
	
	
	
	
}


