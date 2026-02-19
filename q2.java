import java.util.Scanner;

public class lab2q2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an integer:");
		int num = sc.nextInt();
		int sum = 0;
		
		while(num!=0)
		{
			sum += num %10;
			num /= 10;
		}
		
		System.out.println("The sum of all digits is: " + sum);
	}
}