import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test implements ActionListener
{
	JFrame frame;
	JButton insertbtn,viewbtn,updatebtn,deletebtn;
	
	public Test()
	{
		// TODO Auto-generated constructor stub
		
		frame =new JFrame();
		
		insertbtn = new JButton("INSERT");
		viewbtn = new JButton("VIEW");
		updatebtn = new JButton("UPDATE");
		deletebtn = new JButton("DELETE");

		
		insertbtn.addActionListener(this);
		viewbtn.addActionListener(this);
		updatebtn.addActionListener(this);
		deletebtn.addActionListener(this);
		
		
		frame.add(insertbtn);
		frame.add(viewbtn);
		frame.add(updatebtn);
		frame.add(deletebtn);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new Test();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		AllOperations a =new AllOperations();
		
		if(e.getSource()==insertbtn)
		{
			a.insertdata();
		}
		if(e.getSource()==viewbtn)
		{
			a.viewdata();
		}
		if(e.getSource()==deletebtn)
		{
			a.deletedata();
		}
		if(e.getSource()==updatebtn)
		{
			a.updatedata();
		}
	}
}
class AllOperations
{
	JFrame insertframe,updateframe,deleteframe;
	JTextField tf1,tf2,tfid;
	JButton btn1,btn2,btnupdate,btnedit;
	JPanel jp,jp2;
	
	public void insertdata()
	{
		insertframe =new JFrame();
		
		tf1 =new JTextField(10);
		tf2 =new JTextField(10);
		btn1=new JButton("ADD");
		
		
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				String name = tf1.getText().toString();
				String surname =tf2.getText().toString();
				
				
				try 
				{
					
					String host="jdbc:mysql://localhost:3306/";
					String db="details";
					String url =host+db;
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con= DriverManager.getConnection(url,"root","");
					
					String sql="Insert into info values (null,'"+name+"','"+surname+"')";
					
					Statement stmt =con.createStatement();
					
					int status = stmt.executeUpdate(sql);
					
					if(status>0)
					{
						insertframe.setVisible(false);
					}
					else
					{
						System.out.println("Errror");
					}
					
				}
				catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		
		insertframe.add(tf1);
		insertframe.add(tf2);
		insertframe.add(btn1);
		insertframe.setSize(500,500);
		insertframe.setLayout(new FlowLayout());
		insertframe.setVisible(true);
	}
	
	public void viewdata()
	{
		String host="jdbc:mysql://localhost:3306/";
		String db="details";
		String url =host+db;
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection(url,"root","");
			String sql="select * from info";
			
			Statement stmt =con.createStatement();
			ResultSet set = stmt.executeQuery(sql);
			
			System.out.println("ID NAME SURNAME");
			
			while(set.next())
			{
				int id =set.getInt(1);
				String name =set.getString(2);
				String surname =set.getString(3);
				
				
				System.out.println(id+" "+name+" "+surname);
			}
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	public void deletedata()
	{
		deleteframe =new JFrame();
		
		tfid =new JTextField(10);
		btn2 =new JButton("Delete");
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				
				String host="jdbc:mysql://localhost:3306/";
				String db="details";
				String url =host+db;
				
				String id12 = tfid.getText().toString();
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con= DriverManager.getConnection(url,"root","");
					
					String sql ="delete from info where id ='"+id12+"'";
					
					Statement stmt =con.createStatement();
					
					int delete =stmt.executeUpdate(sql);
					
					if(delete>0)
					{
						deleteframe.setVisible(false);
					}
					else
					{
						System.out.println("Errror");
					}
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					}
		});
		
		deleteframe.add(tfid);
		deleteframe.add(btn2);
		deleteframe.setSize(500,500);
		deleteframe.setLayout(new FlowLayout());
		deleteframe.setVisible(true);
		
	}
	public void updatedata()
	{
			updateframe = new JFrame();
			
			tfid =new JTextField(10);
			btnedit =new JButton("Edit");
			
			
			jp =new JPanel();
			jp2=new JPanel();
			
			
			tf1 =new JTextField(20);
			tf2 =new JTextField(20);
			btnupdate =new JButton("Update");
			
			
			
			btnedit.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
				
					
					try 
					{
					
					
						
						String host="jdbc:mysql://localhost:3306/";
						String db="details";
						String url =host+db;
						
						
						
						
						Class.forName("com.mysql.jdbc.Driver");
						Connection con= DriverManager.getConnection(url,"root","");
					
						String id = tfid.getText().toString();
						int id2= Integer.parseInt(id);
						
						String sql ="select * from info where id='"+id2+"'";
						
						Statement stmt=con.createStatement();
						ResultSet set =stmt.executeQuery(sql);
						
						if(set.next())
						{
							int id3 =set.getInt(1);
							String name =set.getString(2);
							String surname =set.getString(3);
							
							jp2.setVisible(true);
							jp.setVisible(false);
							
							tf1.setText(name);
							tf2.setText(surname);
							
							btnupdate.addActionListener(new ActionListener() {
								
								@Override
								public void actionPerformed(ActionEvent e) {
									// TODO Auto-generated method stub
									
									

									String name = tf1.getText().toString();
									String surname =tf2.getText().toString();
									
									
									try 
									{
										
										String host="jdbc:mysql://localhost:3306/";
										String db="details";
										String url =host+db;
										
										Class.forName("com.mysql.jdbc.Driver");
										Connection con= DriverManager.getConnection(url,"root","");
										
										String sql="Update info set name = '"+name+"' , surname ='"+surname+"' where id='"+id3+"'";
										
										Statement stmt =con.createStatement();
										
										int status = stmt.executeUpdate(sql);
										
										if(status>0)
										{
											updateframe.setVisible(false);
										}
										else
										{
											System.out.println("Errror");
										}
										
									}
									catch (Exception e1) 
									{
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
									
									
									
									
								}
							});
							
							
						}
						
					}
					catch (Exception e1) 
					{
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
					
				}
			});
			
			
			jp2.add(tf1);
			jp2.add(tf2);
			jp2.add(btnupdate);
			jp.add(tfid);
			jp.add(btnedit);
			jp.add(jp2);
			jp2.setVisible(false);
			updateframe.add(jp);
			updateframe.add(jp2);
			updateframe.setSize(500,500);
			updateframe.setLayout(new FlowLayout());
			updateframe.setVisible(true);
	
	}
}
