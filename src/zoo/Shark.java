package zoo;

public class Shark extends Animal {
	
	String ocean;
	int age;
	boolean greatWhite;
	
	public void ocean(String ocean)
	{
		System.out.println("The ocean there from is " + ocean);
	}
	
	public void ageGreat(int age, boolean greatWhite)
	{
		if (greatWhite == true)
		{
			System.out.println("It is " + age + " Old and is a great white" );
		}
		
		else
		{
			System.out.println("It is " + age + " Old and is not a great white" );
		}
	}

}
