import java.util.ArrayList;
public class Runner
	{
		public static void main(String[] args)
			{
			ArrayList <Animal> anim= new ArrayList <Animal>();
			anim.add(new Bat());
			anim.add(new PolarBear());
			anim.add(new Ostrich());
			anim.add(new BlueJay());
			for(Animal fred:anim)
				{
				fred.bearsYoung();
				fred.eats();
				fred.makesNoise();
				fred.myFlightBehavior.flies();
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				}
			}
	}