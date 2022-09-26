package com.a269;

public class Svm 
{
	int id;
	String name;
	static String college="VVP"; //static variable
	
	public Svm(int id,String name) 
	{
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+college);
	}
	
	static void change()
	{
		college = "Marwadi";
		//System.out.println(id+" "+name+" "+college);
	}
	public static void main(String[] args) {
		
		Svm s1 =new Svm(101,"A");

		Svm s2 =new Svm(102,"B");
		
		Svm s3 =new Svm(103,"C");
		
	/*	
		*/
		
		/*s1.display();
		s2.change();
		s3.change();*/

		change();
		
		s1.display();
		s2.display();
		s3.display();
	}
	
}
