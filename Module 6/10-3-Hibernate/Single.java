package com.controller;

import java.util.Scanner;

import com.dao.Dao;
import com.model.Person;

public class Single 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter Your Id");
		int id = sc.nextInt();
		
		Person p1 = new Person();
		p1.setId(id);
		
		Person p = 	new Dao().getSingle(p1);
		
		System.out.println("ID: "+p.getId()+"\tName: "+p.getName()+"\tPassword: "+p.getSurname());
	}
}
