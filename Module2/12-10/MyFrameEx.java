package com.a1210;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyFrameEx 
{
	JFrame frame;
	JLabel l1,l2,l3; 
	JTextField tf1;
	JPasswordField tf2;
	JButton btn;
	
	public MyFrameEx() 
	{
		// TODO Auto-generated constructor stub
		frame =new JFrame();
		
		l1 = new JLabel("Login Form");
		l1.setBounds(204, 24, 96, 14);
		
		
		l2 = new JLabel("Username");
		l2.setBounds(46, 58, 96, 14);
		
		
		l3 = new JLabel("Password");
		l3.setBounds(46, 88, 96, 14);
		
		tf1 =new JTextField();
		tf1.setBounds(114, 58, 86, 20);

		tf2 =new JPasswordField();
		tf2.setBounds(114, 85, 86, 20);
		
		btn =new JButton("Login");
		btn.setBounds(69, 127, 89, 23);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				
				String uname =tf1.getText().toString();
				String pass =tf2.getText().toString();
				
				if(pass.equals("1234"))
				{
					System.out.println("Welcome "+uname);
				}
				else
				{
					System.err.println("Your Credentials are wrong");
				}
				
			}
		});
		
		
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(tf1);
		frame.add(tf2);
		frame.add(btn);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	
	}
	
	public static void main(String[] args) 
	{
		
			new MyFrameEx();
		
	}
}
