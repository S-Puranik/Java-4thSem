import java.util.Scanner;

public class q8
{
	public static int factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		return n * factorial(n-1);
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		int fact=factorial(num);
		
		System.out.println("Factorial of " + num +" is: " + fact);
		
	}
}