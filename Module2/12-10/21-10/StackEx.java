package com.a2110;

import java.util.Stack;

public class StackEx 
{
	
	static void push1(Stack st,Integer i)
	{
		st.push(i);
		
		System.out.println(i);
		System.out.println(st);
	
	
	
	}
	static void pop1(Stack st )
	{
		Integer i = (Integer) st.pop();
		
		System.out.println(i);
		System.out.println(st);
		
	}
	
	
	public static void main(String[] args) 
	{
		
			Stack st =new Stack<>();
			
			push1(st, 100);
			push1(st, 200);
			push1(st, 300);
			push1(st, 400);
			
			try
			{
				pop1(st);
				pop1(st);
				pop1(st);
				pop1(st);
				pop1(st);
			}
			catch(Exception e)
			{
				System.out.println("No Data");
			}
		
			
		
	}
}
