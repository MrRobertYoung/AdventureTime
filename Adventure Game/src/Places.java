import java.util.ArrayList;
public class Places
	{
		static ArrayList<Location> places = new ArrayList<Location>();
		static void fillArray()
		{
		places.add(new Location( "town", " A old run down place. It has little inhabitants and those still left are soon to leave due to the necromancer.", "I can either travel out of the town on a path that leads to what looks like fields ", "or stay in town for a bit and talk to the mayor. "));
		places.add(new Location	("fields,", " farmers used to live here keyword used to. They still roam it just with no claim of their mortal coils.", " After walking for a bit you come to a path that splits two directions which way do you want to go left", " or right"));
		//places.add(new Location (" Forbidden forrest", " A dark and creepy forest the smell of sulfer is potient and no one in recent years has returned from its depths"));
		//places.add(new Location (" decrept castle", " The castle is old with cracked bricks and a wide open entrance yet the walls reamin strong."));
		}
		
	}
