import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArraySpaces
{
public static Scanner file1;
public static Scanner file2;
static ArrayList<String> characters =new ArrayList<String>();
public static Scanner userInput2 = new Scanner(System.in);
public static ArrayList<Spaces> makeBoard() throws IOException
{
	System.out.println("Which version of Monopoly would you like?");
	System.out.println("1.) Original Monopoly");
	System.out.println("2.) Star Wars Monopoly");
	int choice = userInput2.nextInt();
	if(choice ==1)
		{
		Scanner file1 = new Scanner(new File("oldM.lnk"));
		ArrayList<Spaces> spacesB = new ArrayList<Spaces>();
		spacesB.add(new Go());
		spacesB.add(new Colors(file1.nextLine(), 0, 0, 0, 0, 0, 0, 60));
		spacesB.add(new Cards(file1.nextLine()));
		spacesB.add(new Colors(file1.nextLine(), 0, 0, 0, 0, 0, 0, 60));
		spacesB.add(new Taxes(file1.nextLine()));
		spacesB.add(new Railroads(file1.nextLine()));
		spacesB.add(new Colors(file1.nextLine(), 0, 0, 0, 0, 0, 0, 100));
		spacesB.add(new Cards(file1.nextLine()));
		spacesB.add(new Colors(file1.nextLine(), 1 , 1, 1, 1, 1, 1, 100));
		spacesB.add(new Colors(file1.nextLine(), 1, 1, 1, 1, 1, 1, 120));
		spacesB.add(new Jail());
		spacesB.add(new Colors(file1.nextLine(), 0, 0, 0, 0, 0, 0, 140));
		spacesB.add(new Utilities(file1.nextLine()));
		spacesB.add(new Colors(file1.nextLine(), 0, 0, 0, 0, 0, 0, 140));
		spacesB.add(new Colors(file1.nextLine(), 0, 0, 0, 0, 0, 0, 160));
		spacesB.add(new Railroads(file1.nextLine()));
		spacesB.add(new Colors(file1.nextLine(), 0, 0, 0, 0, 0, 0, 180));
		spacesB.add(new Cards(file1.nextLine()));
		spacesB.add(new Colors(file1.nextLine(), 1 , 1, 1, 1, 1, 1, 180));
		spacesB.add(new Colors(file1.nextLine(), 1, 1, 1, 1, 1, 1, 200));
		spacesB.add(new FreeParking());
		spacesB.add(new Colors(file1.nextLine(), 0, 0, 0, 0, 0, 0, 220));
		spacesB.add(new Cards(file1.nextLine()));
		spacesB.add(new Colors(file1.nextLine(), 0, 0, 0, 0, 0, 0, 220));
		spacesB.add(new Colors(file1.nextLine(), 0, 0, 0, 0, 0, 0, 240));
		spacesB.add(new Railroads(file1.nextLine()));
		spacesB.add(new Colors(file1.nextLine(), 0, 0, 0, 0, 0, 0, 260));
		spacesB.add(new Colors(file1.nextLine(), 0, 0, 0, 0, 0, 0, 260));
		spacesB.add(new Utilities(file1.nextLine()));
		spacesB.add(new Colors(file1.nextLine(), 1, 1, 1, 1, 1, 1, 280));
		spacesB.add(new GoToJail());
		spacesB.add(new Colors(file1.nextLine(), 0, 0, 0, 0, 0, 0, 300));
		spacesB.add(new Colors(file1.nextLine(), 0, 0, 0, 0, 0, 0, 300));
		spacesB.add(new Cards(file1.nextLine()));
		spacesB.add(new Colors(file1.nextLine(), 0, 0, 0, 0, 0, 0, 320));
		spacesB.add(new Railroads(file1.nextLine()));
		spacesB.add(new Cards(file1.nextLine()));
		spacesB.add(new Colors(file1.nextLine(), 0, 0, 0, 0, 0, 0, 350));
		spacesB.add(new Taxes(file1.nextLine()));
		spacesB.add(new Colors(file1.nextLine(), 1, 1, 1, 1, 1, 1, 400));
		return spacesB;
		}
	else if(choice==2)
		{
		Scanner file2 = new Scanner(new File("oldStar.lnk"));	
		ArrayList<Spaces> spacesB = new ArrayList<Spaces>();
		spacesB.add(new Go());
		spacesB.add(new Colors(file2.nextLine(), 0, 0, 0, 0, 0, 0, 60));
		spacesB.add(new Cards(file2.nextLine()));
		spacesB.add(new Colors(file2.nextLine(), 0, 0, 0, 0, 0, 0, 60));
		spacesB.add(new Taxes(file2.nextLine()));
		spacesB.add(new Railroads(file2.nextLine()));
		spacesB.add(new Colors(file2.nextLine(), 0, 0, 0, 0, 0, 0, 100));
		spacesB.add(new Cards(file2.nextLine()));
		spacesB.add(new Colors(file2.nextLine(), 1 , 1, 1, 1, 1, 1, 100));
		spacesB.add(new Colors(file2.nextLine(), 1, 1, 1, 1, 1, 1, 120));
		spacesB.add(new Jail());
		spacesB.add(new Colors(file2.nextLine(), 0, 0, 0, 0, 0, 0, 140));
		spacesB.add(new Utilities(file2.nextLine()));
		spacesB.add(new Colors(file2.nextLine(), 0, 0, 0, 0, 0, 0, 140));
		spacesB.add(new Colors(file2.nextLine(), 0, 0, 0, 0, 0, 0, 160));
		spacesB.add(new Railroads(file2.nextLine()));
		spacesB.add(new Colors(file2.nextLine(), 0, 0, 0, 0, 0, 0, 180));
		spacesB.add(new Cards(file2.nextLine()));
		spacesB.add(new Colors(file2.nextLine(), 1 , 1, 1, 1, 1, 1, 180));
		spacesB.add(new Colors(file2.nextLine(), 1, 1, 1, 1, 1, 1, 200));
		spacesB.add(new FreeParking());
		spacesB.add(new Colors(file2.nextLine(), 0, 0, 0, 0, 0, 0, 220));
		spacesB.add(new Cards(file2.nextLine()));
		spacesB.add(new Colors(file2.nextLine(), 0, 0, 0, 0, 0, 0, 220));
		spacesB.add(new Colors(file2.nextLine(), 0, 0, 0, 0, 0, 0, 240));
		spacesB.add(new Railroads(file2.nextLine()));
		spacesB.add(new Colors(file2.nextLine(), 0, 0, 0, 0, 0, 0, 260));
		spacesB.add(new Colors(file2.nextLine(), 0, 0, 0, 0, 0, 0, 260));
		spacesB.add(new Utilities(file2.nextLine()));
		spacesB.add(new Colors(file2.nextLine(), 1, 1, 1, 1, 1, 1, 280));
		spacesB.add(new GoToJail());
		spacesB.add(new Colors(file2.nextLine(), 0, 0, 0, 0, 0, 0, 300));
		spacesB.add(new Colors(file2.nextLine(), 0, 0, 0, 0, 0, 0, 300));
		spacesB.add(new Cards(file2.nextLine()));
		spacesB.add(new Colors(file2.nextLine(), 0, 0, 0, 0, 0, 0, 320));
		spacesB.add(new Railroads(file2.nextLine()));
		spacesB.add(new Cards(file2.nextLine()));
		spacesB.add(new Colors(file2.nextLine(), 0, 0, 0, 0, 0, 0, 350));
		spacesB.add(new Taxes(file2.nextLine()));
		spacesB.add(new Colors(file2.nextLine(), 1, 1, 1, 1, 1, 1, 400));
		return spacesB;
		}
	else
		{
		System.out.println("Please chose a vaild option.");
		System.exit(0);
		}
	return null;
}
public static ArrayList<Player> makePlayers()
{
Scanner userInput2 = new Scanner(System.in);
/*characters.add("A.) R2-D2");
characters.add("B.) Han Solo");
characters.add("C.) Luke Skywalker");
characters.add("D.) Princess Leia");
characters.add("E.) Darth Vador");
characters.add("F.) Storm Trooper");
characters.add("G.) Bobo Fett");
characters.add("H.) Chewbacca");*/
System.out.println("How many players would you like?");
int pN = Runner.userInput.nextInt();
ArrayList<Player> userP = new ArrayList<Player>();
for(int m = 0; m < pN; m++)
{
System.out.println("Which character would player " + (m+1) + " like to be?");
String pName = userInput2.nextLine();
userP.add(new Player(pName));
}
return userP;
}
}