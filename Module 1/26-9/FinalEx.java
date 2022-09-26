package com.a269;

final class BankDetail
{
	final String accno="1111";
	
	void detail()
	{
		accno="2222";
		System.out.println(accno);
	}
	final void detail()
	{
		accno="2222";
		System.out.println(accno);
	}
	
	
}

class Customer extends BankDetail
{
	
}

public class FinalEx {

}
