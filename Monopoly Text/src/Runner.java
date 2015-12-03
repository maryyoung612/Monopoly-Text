import java.util.ArrayList;
import java.util.Scanner;
public class Runner
	{
	public static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args)
		{
		ArrayList<Spaces> board = ArraySpaces.makeBoard();
		ArrayList<Player> peeps = ArraySpaces.makePlayers();
		boolean ghost = true;
		while(ghost == true)
			{
			Move.playerMove(peeps, board);
			}

		}
	}