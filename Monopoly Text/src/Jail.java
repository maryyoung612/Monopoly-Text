import java.util.ArrayList;
public class Jail extends Nonownable
	{
	public static boolean reverseIsTrue;
	public static boolean isOnJail;
	public Jail()
		{
		name="Jail";
		}
	public void runningS(ArrayList<Player> peeps,int player, ArrayList<Spaces> spacesB, int place)
		{
		reverseIsTrue=false;
		isOnJail=false;
		while (isOnJail==true)
			{
			spacesB.get(peeps.get(Moves.playerNum).getLocation()==9);
			reverseIsTrue=true;	
			}	
		}
	}