
public class Sword extends Weapon {
	
	//Sword class variables
	private int AttackBonus;
	//private int TotalDamageDealt;
	
	//Sword class constructor
	public Sword(int DamageDealt, int AttackBonus, int TotalDamageDealt, String WeaponName)
	{
		super(DamageDealt, WeaponName, TotalDamageDealt);
		//this.setAttatckBonus(2);
		this.AttackBonus = AttackBonus;
		//this.TotalDamageDealt = TotalDamageDealt;
	}
	
	//Sword class getters and setters
//	public int getTotalDamageDealt() {
//		return TotalDamageDealt;
//	}
//	public void setTotalDamageDealt(int totalDamageDealt) {
//		TotalDamageDealt = totalDamageDealt;
//	}
	public int getAttackBonus() {
		return AttackBonus;
	}

//	public void setAttackBonus(int attatckBonus) {
//		AttackBonus = AttackBonus;
//	}
	
	//Sword class TotalAttack method
	@Override public String TotalAttack(int damageDealt)
	{
		String result = new String();
		result = String.format("Standard Damage Dealt: %d AttackBonus: %d Total attack hitpoints: ", this.getTotalDamageDealt(),  this.AttackBonus );
		return result;
	}
//	@Override public String toString()
//	{
//		String result = new String();
//		
//		result = String.format("Standard Damage Dealt: %d Attack Bonus: %d TotalDamageDealt %d", this.DamageDealt, this.AttackBonus, this.TotalDamageDealt);
//		
//		return result;
//		
//	}
	
	//Sword class to string method
	@Override public String toString()
	{
		String result = new String();
		
		result = String.format("%s TotalDamageDealt: %d", this.WeaponName, this.TotalDamageDealt);
		
		return result;
		
	}

}
