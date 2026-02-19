class Student
{
	int roll_no;
	String name;
	
	void display()
	{
		System.out.println("Name: " + name);
		System.out.println("Roll number: " + roll_no);
	}
	int marks(int a, int b, int c)
	{
		return a+b+c;
	}
	int marks(int a, int b)
	{
		return a+b;
	}
	int marks(int a, int b, int c, int d){
		return a+b+c+d;
	}
}

public class q4
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.name = "Siddhant";
		s1.roll_no = 327;
		
		s1.display();
		System.out.println("Total Marks in two subs: " + s1.marks(93,97));
		System.out.println("Total Marks in three subs: " + s1.marks(93,97,91));
		System.out.println("Total Marks in four subs: " + s1.marks(93,97,100));
	}
}