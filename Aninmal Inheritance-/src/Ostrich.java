
public class Ostrich extends Bird
	{
	Ostrich()
		{
		name = "Ostrich";
		food = "whatever";
		noise= "hiss";
		myFlightBehavior= (FlightBehavior) new CannotFly();
		}
	}