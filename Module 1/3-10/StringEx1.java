package com.a310;

public class StringEx1 
{
	public static void main(String[] args) 
	{
		
		String s1="sachin";
		String s2 = s1.concat(" tendulakr");
		System.out.println(s2);
		
		
		String s3 = "sachin";
		String s4 = "SACHIN";
		String s5 =new String("savhin");
		String s6 ="saurav";
		
		System.out.println(s3.equals(s4));
		System.out.println(s3.equals(s1));
		System.out.println(s3.equalsIgnoreCase(s4));
		
		System.out.println(s1==s3);
		System.out.println(s1==s5);
		
		
		System.out.println(s5.compareTo(s6));
		
		System.out.println(s4.toLowerCase());
		System.out.println(s3.toUpperCase());
		System.out.println(s3.charAt(0));
		
		String s7="java is a programming language. java is a platform";
		
		System.out.println(s7.replace("java","kava"));
	}
}
