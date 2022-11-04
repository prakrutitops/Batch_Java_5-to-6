package com.a41;

enum Student2 
{
	John(11), Bella(10), Sam(13), Viraaj(9);
	
	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	private Student2(int age) 
	{
		this.age= age;
	}
	
}
public class Student
{
	public static void main(String[] args) {
		
		
		System.out.println(Student2.John.getAge());
		
	}
}