
public class Item
	{
		private String name;
		private String description;
		private int attackValue;
		private int healValue;
		
		public Item (String n, String d, int av, int hv)
		{
			name = n;
			description = d;
			attackValue = av;
			healValue = hv;
		}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public String getDescription()
			{
				return description;
			}

		public void setDescription(String description)
			{
				this.description = description;
			}

		public int getAttackValue()
			{
				return attackValue;
			}

		public void setAttackValue(int attackValue)
			{
				this.attackValue = attackValue;
			}

		public int getHealValue()
			{
				return healValue;
			}

		public void setHealValue(int healValue)
			{
				this.healValue = healValue;
			}
		
	}
