
public class Grunt extends Orc {
	
	//Grunt class variables
	private int strength;
	private int speed;
	private int agility;
	private int intelligence;
	
	
	//Grunt class constructor
	public Grunt(int healthPoints, String role, String race, Weapon weapon, Defense defense, int strength, int speed, int agility, int intelligence, String name, int points)
	{
		super(healthPoints, role, race, weapon, defense, name, points);
		this.strength = strength;
		this.speed = speed;
		this.agility = agility;
		this.intelligence = intelligence;
	}
	
	//Grunt class getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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

	//Grunt class attack method
	@ Override public String Attack()
	{
		String result = new String();
		result = String.format("%s %s of the %s race attacked with %s ----> %d health remaining", this.name, this.role, this.race, this.weapon, this.healthPoints);
		return result;
	}
	
	//Grunt class attack method
	@ Override public String Defend()
	{
		String result = new String();
		result = String.format("%s %s of the %s race defended with %s ----> %d health remaining", this.name, this.role, this.race, this.defense, this.healthPoints);
		return result;
	}

	//Grunt class show info method
	public String ShowInfo()
	{
		return String.format("Health: %d role: %s race: %s weapon: %s defense: %s strength: %d speed: %d agility: %d intelligence: %d name: %s", this.healthPoints, this.role, this.race, this.weapon, this.defense, this.strength, this.speed, this.agility, this.intelligence, this.name);
	}
	
	//Grunt class PlaybyPlay method
	@ Override public String PlayByPlay()
	{
		return String.format("Role: %s Name: %s Health: %d Weapon: %s Defense: %s", this.role, this.name, this.healthPoints, this.weapon, this.defense);
	}
}
