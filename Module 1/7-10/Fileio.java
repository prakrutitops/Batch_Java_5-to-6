package com.a710;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Fileio 
{
	public static void main(String[] args) 
	{
		
		try 
		{
			String s = "Welcome to Tops";
			FileOutputStream fout =new FileOutputStream("H://abc.txt");
			fout.write(s.getBytes());
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		}
		finally 
		{
			System.out.println("success");
		}
		
		
	}
}
