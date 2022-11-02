package com.a211;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
	
	
	int marks;
	String name;
	
	
	public Student(int marks,String name) 
	{
		// TODO Auto-generated constructor stub
		this.marks=marks;
		this.name=name;
	}

	@Override
	public int compareTo(Student o) 
	{
		// TODO Auto-generated method stub
	
		int value=0;
		if(this.marks>o.marks) 
		{
			return 1;
		}
		else if (this.marks<o.marks) 
		{
			return -1;
		}
		else if(this.marks==o.marks) 
		{
			return 0;
		}
		
		return value;
		
		
	}
	
}

public class ComparableEx 
{
	public static void main(String[] args) {
		
		
		Student s1 = new Student(50, "Parth");
		Student s2 = new Student(100, "Jay");
		Student s3 = new Student(10, "Dhaval");
		Student s4 = new Student(60, "RAhul");
		Student s5 = new Student(70, "Tapan");
		
		
		ArrayList<Student>al =new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		
		Collections.sort(al);
		
		for(Student s :al)
		{
			System.out.println(s.marks+" "+s.name);
		}
		
		
	}
}
