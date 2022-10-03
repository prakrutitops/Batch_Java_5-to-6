package com.a310;

public class StringBufferEx2 
{
	public static void main(String[] args) {
		
		StringBuffer sb =new StringBuffer("Hello");
		
		//sb.insert(1,"Java");
		 //sb.delete(1, 3);
		//sb.reverse();
		sb.replace(1,3,"Java");
		System.out.println(sb);
		
	}
}
