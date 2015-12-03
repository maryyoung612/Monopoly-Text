import java.util.ArrayList;
public class Moves
	{
	public static void playerMove(ArrayList<Player> peeps, ArrayList<Spaces> spacesB)
		{
		int doubles = 0;
		for(int g =0; g < peeps.size(); g++)
			{
			System.out.println("Player " + (g+1) +"~~~~~~~~~~~~~~~~~~");
			System.out.println("Bank Account: " + peeps.get(g).getMoney()+" credits");
			System.out.println("Real Estate: " + peeps.get(g).getRealEstate());
			System.out.println("You are on the space "  + spacesB.get(peeps.get(g).getLocation()).getName() + ". Roll the dice!");
			Runner.userInput.nextLine();
			int die1 = (int) (Math.random()*6) + 1;
			int die2 = (int) (Math.random()*6) + 1;
			int roll = die1 + die2;
			if(die1 == die2)
				{
				doubles++;
				}
			if(doubles == 3)
				{
				System.out.println("That's three doubles in a row! Go To Jail SUCKA!");
				}
			System.out.println("You rolled a " + die1 + " and a " + die2 + " == " + roll);
			for(int i = 0; i < roll; i++)
				{
				if(peeps.get(g).getLocation() >= spacesB.size() - 1)
					{
					peeps.get(g).setLocation(0);
					System.out.println("You passed GO and recieved 200 credits!");
					peeps.get(g).setMoney(peeps.get(g).getMoney() + 200);
					System.out.println("You now have " + peeps.get(g).getMoney()+" credits");
					}
				else
					{
					peeps.get(g).setLocation(peeps.get(g).getLocation() + 1);
					}
				}
			System.out.println("You landed on " + spacesB.get(peeps.get(g).getLocation()).getName());
			spacesB.get(peeps.get(g).getLocation()).runningS(peeps, g, spacesB,peeps.get(g).getLocation());
			Runner.userInput.nextLine();
			}
		}
	}