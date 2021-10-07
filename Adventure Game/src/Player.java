
public class Player
	{
		private String name;
		private int health;
		private int damage;
		private int level;
		private int experience;
		
		public Player (String n, int h, int d, int l, int e)
		{
	
		name = n;
		health = h;
		damage = d;
		level = l;
		experience = e;
		}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public int getHealth()
			{
				return health;
			}

		public void setHealth(int health)
			{
				this.health = health;
			}

		public int getDamage()
			{
				return damage;
			}

		public void setDamage(int damage)
			{
				this.damage = damage;
			}

		public int getLevel()
			{
				return level;
			}

		public void setLevel(int level)
			{
				this.level = level;
			}

		public int getExperience()
			{
				return experience;
			}

		public void setExperience(int experience)
			{
				this.experience = experience;
			}

	}
