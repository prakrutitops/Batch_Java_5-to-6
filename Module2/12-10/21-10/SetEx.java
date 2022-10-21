package com.a2110;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetEx 
{
	public static void main(String[] args) 
	{
		
		/*HashSet hs =new HashSet<>();
		
		hs.add("TOPS");
		hs.add('H');
		hs.add(10);
		hs.add(10);
		hs.add(10);
		
		System.out.println(hs);*/
		
		
		
		
		LinkedHashSet lhs = new LinkedHashSet<>();
		lhs.add("TOPS");
		lhs.add('H');
		lhs.add(10);
		// insertion order is not maintain in set
		//but its LinkedHasSet 
		//so insertion order is maintain
		System.out.println(lhs);
		
		
		
	}
}
