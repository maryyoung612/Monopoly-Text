
public abstract class Animal
	{
	protected String name;
	protected String food;
	protected String noise;
	protected FlightBehavior myFlightBehavior;
	public abstract void bearsYoung();
	public void eats()
		{
		System.out.println("The "+name+" can't wait for the waiter to bring "+food+" to the table.");
		
		}
	public void makesNoise()
		{
		System.out.println("The "+name+" says "+noise+ ".");	
		}
	}