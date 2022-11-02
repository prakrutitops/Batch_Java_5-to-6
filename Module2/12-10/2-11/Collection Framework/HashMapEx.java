package com.a211;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx 
{
	public static void main(String[] args) 
	{
		
		
			HashMap<String,Integer> map =new HashMap<>();
		
			map.put("a", 101);
			map.put("b", 102);
			map.put("c", 103);
			
			//System.out.println(map);
			
			for(Map.Entry m : map.entrySet())
			{
				System.out.println(m.getKey()+" = "+m.getValue());
			}
			
	}
}
