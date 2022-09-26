package com.a269;

import java.util.Scanner;

public class Encap2 
{
	public static void main(String[] args) 
	{
		
		int number;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter your FirstName");
		String fname=sc.next();
		
		System.out.println("Enter your LastName");
		String lname=sc.next();
		
		System.out.println("Enter your City");
		String city =sc.next();
		
		System.out.println("Enter your Gender");
		String gender =sc.next();
		
		System.out.println("Enter your Pasword");
		String pass =sc.next();
		
		Model m =new Model();
		m.setFname(fname);
		m.setLname(lname);
		m.setCity(city);
		m.setGender(gender);
		m.setPassword(pass);
		
		
		System.out.println("Your registration is done Now if you want to Continue then press 1");
			
		
		number=sc.nextInt();
		switch (number)
		{
		case 1:
			if(pass.equals("1234"))
			{
				System.out.println(m.getFname());
				System.out.println(m.getLname());
				System.out.println(m.getCity());
				System.out.println(m.getGender());
				
			}
			else
			{
				System.out.println("Your credentials are wrong");
			}
			
			break;

		default:System.out.println("Your number is not valid");
			break;
		}
		
		
		//set
		
		
		
		//get
		
		
			
		
	}
}
