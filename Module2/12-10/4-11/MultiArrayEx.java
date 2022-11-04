package com.a41;

public class MultiArrayEx 
{
	public static void main(String[] args) {
		
		int data[][]= {{1,2,3},{3,4,5},{5,6,7}};
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(data[i][j]);
			}
			System.out.println();
		}
		
	}
}
