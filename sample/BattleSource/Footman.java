
public class Footman extends Human{
	
	//Footman class variables
	private int strength;
	private int speed;
	private int agility;
	private int intelligence;
	
	//Footman class constructor
	public Footman(int healthPoints, String role, String race, Weapon weapon, Defense defense, int strength, int speed, int agility, int intelligence, String name, int points)
	{
		super(healthPoints, role, race, weapon, defense, name, points);
		this.healthPoints = healthPoints;
		this.strength = strength;
		this.speed = speed;
		this.agility = agility;
		this.intelligence = intelligence;
		
	}
	
	//Footman class getters and setters
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getAgility() {
		return agility;
	}
	public void setAgility(int agility) {
		this.agility = agility;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	//Footman class attack method
	@ Override public String Attack()
	{
		String result = new String();
		result = String.format("%s %s of the %s race attacked with %s ----> %d health remaining", this.name, this.role, this.race, this.weapon, this.healthPoints);
		return result;
	}
	
	//Footman class defend method
	@ Override public String Defend()
	{
		String result = new String();
		result = String.format("%s %s of the %s race defended with %s ----> %d health remaining", this.name, this.role, this.race, this.defense, this.healthPoints);
		return result;
	}
	
	//Footman class show info method
	@ Override public String ShowInfo()
	{
		return String.format("Health: %d role: %s race: %s weapon: %s defense: %s strength: %d speed: %d agility: %d intelligence: %d", this.healthPoints, this.role, this.race, this.weapon, this.defense, this.strength, this.speed, this.agility, this.intelligence, this.name);
	}
	
	//Footman class PlaybyPlay method
	@ Override public String PlayByPlay()
	{
		return String.format("Role: %s Name: %s Health: %d Weapon: %s Defense: %s", this.role, this.name, this.healthPoints, this.weapon, this.defense);
	}
	
	
	
	
	
}