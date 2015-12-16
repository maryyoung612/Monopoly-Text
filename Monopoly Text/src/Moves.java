import java.util.ArrayList;
public class Moves
	{
	public static int playerNum;
	public static void playerMove(ArrayList<Player> peeps, ArrayList<Spaces> spacesB)
		{
		int doubles = 0;
		for(playerNum =0; playerNum < peeps.size(); playerNum++)
			{
			System.out.println("Player " + (playerNum+1) +"~~~~~~~~~~~~~~~~~~");
			System.out.println("Bank Account: " + peeps.get(playerNum).getMoney()+" credits");
			System.out.println("Real Estate: " + peeps.get(playerNum).getRealEstate());
			System.out.println("You are on the space "  + spacesB.get(peeps.get(playerNum).getLocation()).getName() + ". Roll the dice!");
			Runner.userInput.nextLine();
			int die1 = (int) (Math.random()*6) + 1;
			int die2 = (int) (Math.random()*6) + 1;
			int roll = die1 + die2;
			if(die1 == die2)
				{
				doubles++;
				}
			else if(doubles == 3)
				{
				System.out.println("That's three doubles in a row! Go To Jail SUCKA!");
				}
			
			System.out.println("You rolled a " + die1 + " and a " + die2 + " == " + roll);
			for(int i = 0; i < roll; i++)
				{
				if(peeps.get(playerNum).getLocation() >= spacesB.size() - 1)
					{
					peeps.get(playerNum).setLocation(0);
					System.out.println("You passed GO and recieved 200 credits!");
					peeps.get(playerNum).setMoney(peeps.get(playerNum).getMoney() + 200);
					System.out.println("You now have " + peeps.get(playerNum).getMoney()+" credits");
					}
				else if(Jail.reverseIsTrue==true)
					{
					System.out.println("You landed directly on Jail, you have now turned to the dark side!!!");
					System.out.println("You have to go around the board backwards until you land on Jail again! You do not get any Go money!");
					peeps.get(playerNum).setLocation(peeps.get(playerNum).getLocation() - roll);
					}
				else
					{
					peeps.get(playerNum).setLocation(peeps.get(playerNum).getLocation() + 1);
					}
				}
			System.out.println("You landed on " + spacesB.get(peeps.get(playerNum).getLocation()).getName());
			spacesB.get(peeps.get(playerNum).getLocation()).runningS(peeps, playerNum, spacesB,peeps.get(playerNum).getLocation());
			Runner.userInput.nextLine();
			}
		}
	}