class add
	{
	int add(int a, int b){
	return a+b;
	}

	int add(int a,int b,int c)
	{
		return a+b+c;
	}
}

public class q3
{
	public static void main(String[] args)
	{
		add a = new add();
		System.out.println(a.add(1,2));
		System.out.println(a.add(1,2,3));
	}
}