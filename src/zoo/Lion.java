package zoo;

public class Lion extends Animal {
	
	int sizeOfPride;
	boolean leader;
	String habitat;
	
	
	public void pride(int sizeOfPride)
	{
		System.out.println("The pride is " + sizeOfPride);
	}
	
	public void leader(boolean leader)
	{
		if (leader == true)
		{
			System.out.println("He is the leader" );
		}
		else 
		{
			System.out.println("He is no leader");
		}
	}
	
	


}
