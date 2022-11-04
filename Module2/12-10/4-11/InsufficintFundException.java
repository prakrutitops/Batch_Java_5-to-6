package com.a41;

public class InsufficintFundException extends Exception
{
		
	double amount;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	InsufficintFundException(double amount)
	{
		this.amount=amount;
	}
	
	
}
