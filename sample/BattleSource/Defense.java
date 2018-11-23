
public abstract class Defense {
	
	//Variables to the Defense class
	protected int DamageBlocked;
	protected String DefenseName;
	protected int TotalDamageBlocked;
	
	
	//Constructor to the defense class
	public Defense(int DamageBlocked, String DefenseName, int TotalDamageBlocked)
	{
		this.DamageBlocked = DamageBlocked;
		this.DefenseName = DefenseName;
		this.TotalDamageBlocked = TotalDamageBlocked;
	}
	
	//Defense class getters and setters
	public int getTotalDamageBlocked() {
		return TotalDamageBlocked;
	}
	public void setTotalDamageBlocked(int totalDamageBlocked) {
		TotalDamageBlocked = totalDamageBlocked;
	}
	public String getDefenseName() {
		return DefenseName;
	}

	public void setDefenseName(String defenseName) {
		DefenseName = defenseName;
	}

	public int getDamageBlocked() {
		return DamageBlocked;
	}

	public void setDamageBlocked(int damageBlocked) {
		DamageBlocked = damageBlocked;
	} 
	
	//Total defense method inside the defense class
	public abstract String TotalDefense(int damageblock);


}
