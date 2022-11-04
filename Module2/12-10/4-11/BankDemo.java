package com.a41;

import java.util.Scanner;

public class BankDemo 
{
	public static void main(String[] args) 
	{
		
		BankDemo demo = new BankDemo();
		CheckingAccount ca = new CheckingAccount(101);
		
		ca.deposite(10000);
		
		System.out.println("Enter your Withdrawal amount");
		Scanner sc =new Scanner(System.in);
		
		try
		{
			
			int data =sc.nextInt();
			ca.withdrawal(data);
			System.out.println("Your Reamining balance is = "+ca.getBalance());
		}
		catch (InsufficintFundException e) 
		{
			System.out.println("You have not sufficient balance, You need more  "+e.getAmount());
			System.out.println("Your balance is = "+ca.getBalance());
		}
		
		
	}
}
