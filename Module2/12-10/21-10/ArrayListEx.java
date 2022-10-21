package com.a2110;

import java.util.ArrayList;
import java.util.Iterator;

import com.a1210.a;

public class ArrayListEx 
{
	public static void main(String[] args)
	{
		
			ArrayList<String> arrayList = new ArrayList<>();
			
			arrayList.add("android");
			arrayList.add("java");
			arrayList.add("php");
			arrayList.add("ios");
			arrayList.add("DM");

			ArrayList<String> arrayList2 = new ArrayList<>();
			
			arrayList2.add("WD");
			arrayList2.add("DM");
			
			/*arrayList.addAll(arrayList2);
			
			arrayList.remove("java");
			arrayList.removeAll(arrayList2);
			*/
			
			
			arrayList.retainAll(arrayList2);
			
			
			//System.out.println(arrayList);
			
			//Interface
			
			Iterator i = arrayList.iterator();
			
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			
			
			
			
			
		
	}
}
