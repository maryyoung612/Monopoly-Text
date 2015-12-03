import java.util.ArrayList;
public abstract class Spaces
	{
	protected String name;
	public String getName()
		{
		return name;
		}

	public void setName(String name)
		{
		this.name = name;
		}
	protected abstract void runningS(ArrayList<Player> peeps,int player, ArrayList<Spaces> spacesB, int place);
	}