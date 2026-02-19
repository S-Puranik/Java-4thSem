import java.util.Scanner;
import java.lang.Math;
public class q6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int temp = num;
		int sum=0;
		int length=0;
		
		while(temp != 0)
		{
			length++;
			temp /=10;
		}
		temp = num;
		while(num !=0)
		{
			sum += (int)Math.pow(num%10,length);
			num /= 10;
		}
		
		if(sum==temp)
		{
			System.out.println(temp +" is an armstrong number");
		}
		else
		{
			System.out.println(temp +" is not an armstrong number");
		}
	}
}
