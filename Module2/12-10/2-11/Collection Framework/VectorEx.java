package com.a2110;

import java.util.Vector;

public class VectorEx 
{
	public static void main(String[] args) 
	{
		Vector v =new Vector<>(5);
		
		v.addElement("10");
		v.addElement("20");
		v.addElement("30");
		v.addElement("40");
		v.addElement("50");
		v.addElement("50");
		v.addElement("20");
		v.addElement("30");
		v.addElement("40");
		v.addElement("50");
		v.addElement("50");
		
		System.out.println(v.size());
		System.out.println(v.capacity());
	}
}
