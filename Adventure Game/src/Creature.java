
public class Creature
	{
	private String creature;
	private int health;
	private int damage;
	
	public Creature (String c,  int h, int d)
	{
		creature = c;
		health = h;
		damage = d;
	}

	public String getCreature()
		{
			return creature;
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

	public void setCreature(String creature)
		{
			this.creature = creature;
		}

	
	

	}
