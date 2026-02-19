import java.util.Scanner;
public class lab2q3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of n:");
		int n = sc.nextInt();
		
		int a = 0;
		int b = 1;
		if(n==0){
				System.out.println(a);
		}
		else
		{
			System.out.print("0 ");
			for(int i =1; i<n; i++)
			{
				int sum = a+b;
				System.out.print(sum + " ");
				a = b;
				b = sum;
			}
		}
		
	}
}
