package com.a239;

import java.util.Scanner;

public class ObjectEx 
{
	static int id=0;
	static String name="";
	
	public static void main(String[] args) 
	{
		
		//classname objname =new classname();
		
		ObjectEx o1 = new ObjectEx();
		ObjectEx o2 = new ObjectEx();
		ObjectEx o3 = new ObjectEx();
		
		Scanner sc =new Scanner(System.in);
	
		System.out.println("Enter your id");
		 id=sc.nextInt();
		
		System.out.println("Enter your name");
		 name=sc.next();
		
		o1.id=id;
		o1.name=name;
		
		
		
		/*o1.id=101;
		o1.name="siddharth";
		
		o2.id=102;
		o2.name="Dhruvil";*/
		
		System.out.println(o1.id+" "+o1.name);
		//System.out.println(o2.id+" "+o2.name);
		
		
	}
}
