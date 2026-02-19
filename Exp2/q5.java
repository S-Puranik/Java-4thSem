class Bill
{
	String product_name;
	int quantity;
	int price;
	int discount;
	
	int total_bill(int price, int quantity)
	{
		return price*quantity;
	}
	int total_bill(int price, int quantity, int discount)
	{
		int total = (price*quantity);
		int disc = total*discount/100;
		return total - disc;
	}
}

public class q5
{
	public static void main(String[] args)
	{
		Bill b = new Bill();
		b.product_name = "Books";
		b.price = 100;
		b.quantity = 10;
		b.discount = 5;
		
		System.out.println("Total bill: " + b.total_bill(b.price, b.quantity));
		System.out.println("After applying 5% discount total bill: " + b.total_bill(b.price, b.quantity, b.discount));
	}
}