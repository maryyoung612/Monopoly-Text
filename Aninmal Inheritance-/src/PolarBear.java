
public class PolarBear extends Mammal
	{
	PolarBear()
		{
		name = "Polar Bear";
		food = "seals";
		noise= "growl";
		myFlightBehavior= (FlightBehavior) new CannotFly();
		}
	}