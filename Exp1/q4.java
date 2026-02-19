import java.util.Scanner;
public class q4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int temp = num;
		int num2 = 0;
		while(num != 0)
		{
			num2 += num %10;
			num2 *= 10;
			num /= 10;
		}
		num2 /=10;
		
		if(temp == num2)
		{
			System.out.println(num2 + " is a palindrome of " + temp);
		}
		else
		{
			System.out.println(num2 + " is not a palindrome of " + temp);
		}
	}
}
