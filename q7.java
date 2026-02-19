import java.util.Scanner;
public class q7
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
		System.out.println("Reversed: " + num2);
	}
}