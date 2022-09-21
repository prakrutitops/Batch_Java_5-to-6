import java.util.Scanner;

public class UserInputEx 
{
	public static void main(String[] args) {
		
		
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("Enter your id");
			int id = sc.nextInt();
			
			System.out.println("Enter your name");
			String name =sc.next();
			
			System.out.println("Enter your salary");
			double salary =sc.nextDouble();
			
			System.out.println("\n Your id is :"+id+"\n Your Name is: "+name+" \n Your Salary is : "+salary);
			
	}
}
