/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) 
	{
	    for(int i=1;i<=5;i++)
	    {
	        for(int space=1;space<5-i+2;space++)
	        
	            System.out.print(" ");
	        
	        for(int j=1;j<=i;j++)
	        
	           System.out.print("* ");
	        
	        System.out.println();
	        
	    }
	}
}
