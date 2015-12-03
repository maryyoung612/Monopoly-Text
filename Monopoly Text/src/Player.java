import java.util.ArrayList;
public class Player
	{
	private int money;
	private int location;
	private String pName;
	private int pNum;
	private ArrayList<Spaces> realEstate;
	public Player(String pName2)
		{
		money = 1000;
		pName= pName2;
		realEstate = new ArrayList<Spaces>();
		}
	public int getMoney()
		{
		return money;
		}
	public void setMoney(int money)
		{
		this.money = money;
		}
	public int getLocation()
		{
		return location;
		}
	public void setLocation(int location)
		{
		this.location = location;
		}
	public String getpName()
		{
		return pName;
		}
	public void setpName(String pName)
		{
		this.pName = pName;
		}
	public int getpNum()
		{
		return pNum;
		}
	public void setpNum(int pNum)
		{
		this.pNum = pNum;
		}
	public int getRealEstate()
		{
		for (int i=0; i<realEstate.size();i++)
			{
			System.out.print(realEstate.get(i).getName() + ", ");
			}
		return realEstate.size();
		}
	public void setRealEstate(ArrayList<Spaces> realEstate)
		{
		this.realEstate = realEstate;
		}
	public void addREstate(Spaces temp)
		{
		realEstate.add(temp);
		}
	}