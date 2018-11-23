
public abstract class Human {
	//Human class weapon and defense
	protected final Weapon weapon;
	protected final Defense defense;
	
	//Human class variables
	protected int healthPoints;
	protected String role; 
	protected String race;
	protected String name;
	protected int points;
	
	//Human class constructor
	public Human(int healthPoints, String role, String race, Weapon weapon, Defense defense, String name, int points) 
	{
		this.healthPoints = healthPoints;
		this.role = role;
		this.race = race;
		this.weapon = weapon;
		this.defense = defense;
		this.name = name;
		this.healthPoints = points;
	}
	
	//Human class getters and setters
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
	
	//Human abstract class attack method 
	public abstract String Attack();
	
	//Human abstract class Defend method
	public abstract String Defend();
	
	//Human abstract class show info method
	public abstract String ShowInfo();
	
	//Human abstract class Play by play method
	public abstract String PlayByPlay();

}
