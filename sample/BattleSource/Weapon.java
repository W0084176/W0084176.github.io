
public abstract class Weapon {
	
	//Weapon class variables
	protected int DamageDealt;
	protected String WeaponName;
	protected int TotalDamageDealt;
	
	//Weapon class constructor
	public Weapon(int DamageDealt, String WeaponName, int TotalDamageDealt)
	{
		this.DamageDealt = DamageDealt;
		this.WeaponName = WeaponName;
		this.TotalDamageDealt = TotalDamageDealt;
	}

	//Weapon class getters and setters and settters
	public int getTotalDamageDealt() {
		return TotalDamageDealt;
	}
	public void setTotalDamageDealt(int totalDamageDealt) {
		TotalDamageDealt = totalDamageDealt;
		DamageDealt = totalDamageDealt;
	}

	public String getWeaponName() {
		return WeaponName;
	}

	public void setWeaponName(String weaponName) {
		WeaponName = weaponName;
	}
	public int getDamageDealt() {
		return DamageDealt;
	}

	public void setDamageDealt(int damageDealt) {
		DamageDealt = damageDealt;
	}

	//Weapon class Attack method
	public abstract String TotalAttack(int damageDealt);

}
