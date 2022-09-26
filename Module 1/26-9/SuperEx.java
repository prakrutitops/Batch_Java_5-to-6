package com.a269;

class Color
{
	String color="black";
}
class Color2 extends Color
{
	String color="white";
	
	void detail()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class SuperEx 
{
	public static void main(String[] args) 
	{
		
		Color2 c =new Color2();
		
		c.detail();
		
		
		
	}
}
