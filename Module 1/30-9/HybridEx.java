package com.a309;

class P
{
	void p()
	{
		System.out.println("P Accessed");
	}
}
class Q extends P
{
	void q()
	{
		System.out.println("Q Accessed");
	}
}
interface R 
{
	void r();
	
}
class S extends Q implements R
{
	void s()
	{
		System.out.println("S Accessed");
	}

	@Override
	public void r() {
		// TODO Auto-generated method stub
		System.out.println("R Accessed");
	}
}

public class HybridEx 
{
	public static void main(String[] args) {
		
		S s =new S();
		s.p();
		s.q();
		s.r();
		s.s();
		
	}
}
