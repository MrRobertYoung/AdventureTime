import java.util.Scanner;

public class AdventureTime
	{
		static Scanner userStringInput;
		static Scanner userIntInput;
		public static int choice = 0 ;
		public static void main(String[] args)
		
		{
			playerintro();
			Places.fillArray();
			startAdventure();
		}
		public static void playerintro()
	
			{
				 userStringInput=new Scanner (System.in);
				 userIntInput=new Scanner (System.in);	
				

				System.out.println("What is your name");
				String name= userStringInput.nextLine();
				Player character = new Player (name, 25, 5, 1, 0  );
				System.out.println();
				System.out.println("Your name is " + character.getName());
				System.out.println("Your health is " + character.getHealth());
				System.out.println("Your damage is "+ character.getDamage());
				System.out.println("Your level is " + character.getLevel());
				System.out.println("You have " + character.getExperience() + " experience points" );
				
				System.out.println("Hello good sir Knight " + name + ". Have you come to deliver us from our blight. Malhomo visoroculus.");
				System.out.println("a old necromancere who has hold him self up in the old castle of the forbidden forrest and has been raising the dead.");
				System.out.println("Please slay him and help us to live our lifes happy and healthy.");
				
				System.out.println("Press Enter To Continue");
				String enter= userStringInput.nextLine();
				for(int i = 0; i <=100; i++)
					{
						System.out.println(" ");
					}
				
				
				
				
				
			}
			public static void startAdventure()
			{
			System.out.println("You are in a " + Places.places.get(0).getName() + Places.places.get(0).getDescription()+ Places.places.get(0).getOption1() + Places.places.get(0).getOption2());
			
					System.out.println(" Enter 1 if you would like to stay in town, press 2 if you would like to travel to the fields");
					int choice= userIntInput.nextInt();
					
			if(choice == 1 )
				{
				System.out.println("You stay in town and talk to the mayor again. You complain like a little baby that your fists may not be enough to beat a necromancer.");
				System.out.println("he laughs at you and says. Here have a wooden sword");
				System.out.println("You acquired a wooden Sword.");
				
				System.out.println("You leave town now and head down the path. ");
				System.out.println("you arrive in some " + Places.places.get(1).getName() + Places.places.get(1).getDescription()+ Places.places.get(1).getOption1()+ Places.places.get(1).getOption2());	
				
				}
			else if(choice == 2)
			{
			System.out.println("you arrive in some " + Places.places.get(1).getName() + Places.places.get(1).getDescription()+ Places.places.get(1).getOption1()+ Places.places.get(1).getOption2());
			System.out.println("Press 1 if left, press 2 if right");
			int choice1= userIntInput.nextInt();
			if(choice1 == 1 )
				{
				System.out.println("You come accrose ");	
				}
			}
			}

	}
