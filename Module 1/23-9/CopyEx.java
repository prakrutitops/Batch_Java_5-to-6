package com.a239;

import org.omg.CORBA._PolicyStub;

public class CopyEx 
{
	int id;
	String name,email,pass;
	
	CopyEx(int id,String name,String email,String pass) 
	{
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.email=email;
		this.pass=pass;
		
	}
	
	CopyEx(CopyEx c2)
	{
		System.out.println(c2.id+" "+c2.name+c2.email+" "+c2.pass);
		
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+email+" "+pass);
		
	}
	
	public static void main(String[] args) 
	{
		CopyEx c =new CopyEx(101, "tops","tops@gmail.com","1234");
		CopyEx c2 =new CopyEx(c);
		
		c.display();
		
		
	}
}
