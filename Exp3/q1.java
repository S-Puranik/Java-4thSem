class Access_Mod
{ 
	public String name ="Siddhant"; 
	protected int roll = 27; 
	int sem = 4;
	private int sap = 7224315;

	void display()
	{
		System.out.println("Public access Name: " + name); 
		System.out.println("Protected access roll: " + roll);
		System.out.println("Default access sem: " + sem);
		System.out.println("Private access sap id: " + sap);
	}
}
public class q1 {
	public static void main(String args[]) 
	{ 
		Access_Mod obj = new Access_Mod(); 
		obj.display();
}
}