package com.a41;

import java.io.IOError;
import java.io.IOException;

class M
{
	void m() throws IOException
	{
		System.out.println("M Called");
	}
}
class N extends M
{
	void n() 
	{
		System.out.println("N Called");
	}
}
class P extends N
{
	void p() 
	{
		System.out.println("P Called");
	}
}


public class ThrowsEx 
{
	public static void main(String[] args) throws IOException 
	{
		
		P p1 =new P();
		p1.m();
		p1.n();
		p1.p();
		
	}
}
