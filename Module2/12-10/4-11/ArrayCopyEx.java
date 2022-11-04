package com.a41;

public class ArrayCopyEx 
{
	public static void main(String[] args) {
		
		
		int A[]= {1,2,3,4,5,6,7,8};
		
		int B[]=new int[10];
		
		
		System.arraycopy(A, 3, B, 2, 3);
		
		for(int i=0;i<10;i++)
		{
			System.out.println(B[i]);
		}
		
	}
}
