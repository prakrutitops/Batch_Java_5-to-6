package com.a1010;

public class Pattern1 
{
	
	static int i=0,j=0;
	
	public static void main(String[] args) {
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}
