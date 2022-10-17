package com.a1710;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MyFormEx implements ActionListener,ItemListener
{
	JFrame frame;
	JTextField tf1,tf2,tf3;
	JPasswordField tf4;
	JLabel l1,l2,l3,l4,l5,l6;
	JButton register;
	JCheckBox chk1,chk2,chk3;
	JRadioButton rb1,rb2;
	String hobbies="";
	String gender="";
	String h2,h3,h4;
	JComboBox cb;
	String city[]= {"Rajkot","Surat","Baroda"};
	public MyFormEx()
	{
		// TODO Auto-generated constructor stub
		
		frame = new JFrame();
		
		tf1 = new JTextField();
		tf1.setBounds(135, 10, 173, 20);

		
		tf2 = new JTextField();
		tf2.setBounds(135, 40, 173, 20);
	
		tf3 =new JTextField();
		tf3.setBounds(135, 70, 173, 20);
		
		tf4 =new JPasswordField();
		tf4.setBounds(135, 100, 173, 20);
		
		l1 =new JLabel("Name");
		l1.setBounds(10, 14, 66, 14);
		
		l2 =new JLabel("Surname");
		l2.setBounds(10, 44, 66, 14);
		
		l3 =new JLabel("Email");
		l3.setBounds(10, 74, 66, 14);
	
		l4 =new JLabel("Password");
		l4.setBounds(10, 104, 66, 14);
		
		l5 =new JLabel("Hobbies");
		l5.setBounds(10, 134, 66, 14);
		
		l6 =new JLabel("Gender");
		l6.setBounds(10, 164, 66, 14);
		
		chk1 =new JCheckBox("Cricket");
		chk1.setBounds(135, 130, 70, 23);
		
		chk2 =new JCheckBox("Chess");
		chk2.setBounds(205, 130, 70, 23);
		
		chk3 =new JCheckBox("Xyz");
		chk3.setBounds(275, 130, 70, 23);
		
		
		rb1 =new JRadioButton("Male");
		rb1.setBounds(135, 160, 70, 23);
		
		rb2 =new JRadioButton("Female");
		rb2.setBounds(205, 160, 70, 23);
		
		ButtonGroup bg =new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		register =new JButton("REGISTER");
		register.setBounds(135, 200, 173, 20);
		
		cb =new JComboBox<>(city);
		cb.setBounds(135, 250, 173, 20);
		
		cb.addItemListener(this);
		
		register.addActionListener(this);
		chk1.addItemListener(this);
		chk2.addItemListener(this);
		chk3.addItemListener(this);
		rb1.addItemListener(this);
		rb2.addItemListener(this);
		
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(l6);
		frame.add(tf1);
		frame.add(tf2);
		frame.add(tf3);
		frame.add(tf4);
		frame.add(chk1);
		frame.add(chk2);
		frame.add(chk3);
		frame.add(rb1);
		frame.add(rb2);
		frame.add(register);
		frame.add(cb);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new MyFormEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
	
		String name =tf1.getText().toString();
		String surname =tf2.getText().toString();
		String email= tf3.getText().toString();
		String password =tf4.getText().toString();
		
		System.out.println(name+" "+surname+" "+email+" "+password);
	
		try 
		{
			FileOutputStream fout =new FileOutputStream("E://tops.txt");
		
			String name1="\n your name is :";
			fout.write(name1.getBytes());
			fout.write(name.getBytes());
			
			String surname1="\n your surname is :";
			fout.write(surname1.getBytes());
			fout.write(surname.getBytes());
			
			String email1="\n your email is :";
			fout.write(email1.getBytes());
			fout.write(email.getBytes());
			
			String pass1="\n your password is :";
			fout.write(pass1.getBytes());
			fout.write(password.getBytes());
			
			String Hobbies1="\n your Hobbies are :";
			fout.write(Hobbies1.getBytes());
			fout.write(h2.getBytes());
			fout.write(h3.getBytes());
			fout.write(h4.getBytes());
			
			String gender1="\n your Gender is :";
			fout.write(gender1.getBytes());
			fout.write(gender.getBytes());
			
		
		}
		catch (Exception e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("success");
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==chk1)
		{
			 h2 = hobbies.concat("Cricket");
		}
		if(e.getSource()==chk2)
		{
			 h3 = hobbies.concat("Chesss");

		}
		if(e.getSource()==chk3)
		{
			 h4 = hobbies.concat("Xyz");

		}
		if(e.getSource()==rb1)
		{
			gender="Male";
		}
		if(e.getSource()==rb2)
		{
			gender="Female";
		}
		if(e.getSource()==cb)
		{
			System.out.println("Your City is :"+cb.getItemAt(cb.getSelectedIndex()));
		}
	}

}
