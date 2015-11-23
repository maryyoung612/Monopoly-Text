
public class Bat extends Mammal
	{
	Bat()
		{
		name = "Bat";
		food = "fruit";
		noise= "shrek";
		myFlightBehavior= (FlightBehavior) new CanFly();
		}
	
	}