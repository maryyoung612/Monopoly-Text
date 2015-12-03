import java.util.ArrayList;
public class Colors extends Ownable
	{
	private int rent;
	private int hRent;
	private int hotelRent;
	private int houseNum;
	private int h2Rent;
	private int h3Rent;
	private int h4Rent;
	public Colors(String n, int r, int hr, int hr2, int hr3, int hr4, int hor, int p)
		{
		setName(n);
		rent = r;
		hRent = hr;
		h2Rent = hr2;
		h3Rent = hr3;
		h4Rent = hr4;
		hotelRent = hor;
		houseNum = 0;
		price = p;
		moragae = price / 2;
		owned = false;
		}
	public void runningP(ArrayList<Player> peeps, int player, ArrayList<Spaces> spacesB)
		{
		
		}
	public int getRent()
		{
		return rent;
		}
	public void setRent(int rent)
		{
		this.rent = rent;
		}
	public int gethRent()
		{
		return hRent;
		}
	public void sethRent(int hRent)
		{
		this.hRent = hRent;
		}
	public int getHotelRent()
		{
		return hotelRent;
		}
	public void setHotelRent(int hotelRent)
		{
		this.hotelRent = hotelRent;
		}
	public int getHouseNum()
		{
		return houseNum;
		}
	public void setHouseNum(int houseNum)
		{
		this.houseNum = houseNum;
		}
	public int getH2Rent()
		{
		return h2Rent;
		}
	public void setH2Rent(int h2Rent)
		{
		this.h2Rent = h2Rent;
		}
	public int getH3Rent()
		{
		return h3Rent;
		}
	public void setH3Rent(int h3Rent)
		{
		this.h3Rent = h3Rent;
		}
	public int getH4Rent()
		{
		return h4Rent;
		}
	public void setH4Rent(int h4Rent)
		{
		this.h4Rent = h4Rent;
		}
	}