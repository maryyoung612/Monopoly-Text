import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Runner
	{
	public static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) throws IOException
		{
		
		ArrayList<Spaces> board = ArraySpaces.makeBoard();
		ArrayList<Player> peeps = ArraySpaces.makePlayers();
		boolean ghost = true;
		while(ghost == true)
			{
			Moves.playerMove(peeps, board);
			}

		}
	}