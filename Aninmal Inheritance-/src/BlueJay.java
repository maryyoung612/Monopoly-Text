
public class BlueJay extends Bird
	{
	BlueJay()
		{
		name = "Blue Jay";
		food = "nuts";
		noise= "chrip";
		myFlightBehavior= (FlightBehavior) new CanFly();
		}
	}