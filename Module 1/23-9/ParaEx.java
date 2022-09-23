package com.a239;

public class ParaEx 
{
	int id;
	String name;
	
	public ParaEx(int id,String name) 
	{
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		
		ParaEx p1 =new ParaEx(101,"Dhruvil");
		ParaEx p2 =new ParaEx(102, "Siddharth");
		
		p1.display();
		p2.display();
	
	}
}
