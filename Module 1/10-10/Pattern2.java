package com.a1010;

public class Pattern2 
{
	public static void main(String[] args) {
		
		int i=0,j=0,space=0;
		
		for(i=1;i<=5;i++)
		{
			for(space=0;space!=(5-i);space++)
			{
				System.out.print(" ");
			}
			
			for(j=5;j>space;j--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}
}
