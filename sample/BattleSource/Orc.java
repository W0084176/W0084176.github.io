
public abstract class Orc {
	//Orc class final weapon and defense
	protected final Weapon weapon;
	protected final Defense defense;
	
	//Orc class variables
	protected int healthPoints;
	protected String role; 
	protected String race;
	protected String name;
	protected int points;
	
	//Orc class constructor
	public Orc(int healthPoints, String role, String race, Weapon weapon, Defense defense, String name, int points)
	{
		this.healthPoints = healthPoints;
		this.role = role;
		this.race = race;
		this.weapon = weapon;
		this.defense = defense;
		this.name = name;
		this.points = points;
	}
	
	//Orc class getters and setters
	public Weapon getWeapon()
	{
		return this.weapon;
	}
	public Defense getDefense()
	{
		return this.defense;
	}
	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	//Orc class Attack abstract method
	public abstract String Attack();
	
	//Orc class Defend abstract method
	public abstract String Defend();
	
	//Orc class Show info abstract method
	public abstract String ShowInfo();
	
	//Orc class abstract PlaybyPlay method
	public abstract String PlayByPlay();
	
}