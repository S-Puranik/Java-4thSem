class car
	{
		int year;
		String brand;
		
		void display()
		{	
		System.out.println("Brand: "+ brand);
		System.out.println("Year: " + year);
		}
	}

public class q1 
{	
	public static void main(String[] args)
	{
		car c1 = new car();
		c1.year = 2022;
		c1.brand = "Honda";
		
		c1.display();
	}
}