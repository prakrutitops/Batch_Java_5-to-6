package com.a41;

public class SingleDimensionalArray 
{
	public static void main(String[] args) {
		
		int marks[] = new int[5];
		
		marks[0]=10;
		marks[1]=20;
		marks[2]=30;
		marks[3]=40;
		marks[4]=50;
		
		int marks2[]= {1,2,3,4,5};
		
		for(int i=0;i<5;i++)
		{
			System.out.println(marks[i]);
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(marks2[i]);
		}
		
		
		
	}
}
