import java.util.ArrayList;
public abstract class Ownable extends Spaces
	{
	protected boolean owned;
	protected boolean monopoly;
	protected int moragae;
	protected int price;
	public abstract void runningP(ArrayList<Player> peeps,int player, ArrayList<Spaces> spacesB);
	public void runningS(ArrayList<Player> peeps,int player, ArrayList<Spaces> spacesB, int place)
		{
		if(owned == true)
			{
			runningP(peeps,player,spacesB);
			}
		else
			{
			System.out.println("Would you like to buy " + name + " for " + price + " credits? (1 = yes, you have " + peeps.get(player).getMoney() + ")");
			int g = Runner.userInput.nextInt();
			if(g == 1 && peeps.get(player).getMoney() >= price)
				{
				System.out.println("Congrats, you own " + name + ".");
				peeps.get(player).setMoney(peeps.get(player).getMoney() - price);
				owned = true;
				peeps.get(player).addREstate(spacesB.get(place));
				}
			else if(g == 1)
				{
				System.out.println("You ain't got enough credits for that!");
				}
			}
		}
	}