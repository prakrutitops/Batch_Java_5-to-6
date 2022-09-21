
public class NestedifEx 
{
	public static void main(String[] args) {
		
		int age =56;
		
		if(age>=18)
		{
			System.out.println("Eligible");
			
			if(age>=50)
			{
				System.out.println("Senior citizen");
			}
			else
			{
				System.out.println("Young");
			}
			
		}
		else
		{
			System.out.println("Not Eligible");
		}
		
	}
}
