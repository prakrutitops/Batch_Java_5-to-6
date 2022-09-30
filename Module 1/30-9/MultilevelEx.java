package com.a309;

class A
{
	void a()
	{
		System.out.println("A Accessed");
	}
}
class B extends A
{
	void b()
	{
		System.out.println("B Accessed");
	}
}
class C extends B
{
	void c()
	{
		System.out.println("C Accessed");
	}
}
public class MultilevelEx 
{
	public static void main(String[] args) 
	{
		C c =new C();
		
		c.a();
		c.b();
		c.c();
	}
}
