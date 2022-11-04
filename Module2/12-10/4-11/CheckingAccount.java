package com.a41;

public class CheckingAccount 
{
	int accno;
	double balance;
	
	
	public CheckingAccount(int accno) 
	{
		// TODO Auto-generated constructor stub
		this.accno=accno;
	}
	
	public void deposite(double amount) 
	{
		this.balance=amount;
	}
	
	public void withdrawal(double amount) throws InsufficintFundException 
	{
			
		if(amount<=balance)
		{
			balance = balance - amount;
			
		}
		else
		{
			double needs = amount-balance;
			throw new InsufficintFundException(needs);
		}
	}

	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	
}
