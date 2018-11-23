
public class SteelVest extends Defense {
	
	//Steel vest class variables
	private int DefenseBonus;
	//private int TotalDamageBlocked;
	
	//Steel vest constructor
	public SteelVest(int DamageBlocked, int DefenseBonus, int TotalDamageBlocked, String DefenseName )
	{
		super(DamageBlocked,DefenseName, TotalDamageBlocked);
		this.DefenseBonus = DefenseBonus;
		//this.TotalDamageBlocked =TotalDamageBlocked;
	}
	
	//Steel vest getters and setters
	public int getDefensekBonus() {
		return DefenseBonus;
	}
	public void setDefenseBonus(int DefenseBonus) {
		DefenseBonus = DefenseBonus;
	}
//	public int getTotalDamageBlocked() {
//		return TotalDamageBlocked;
//	}
//
//	public void setTotalDamageBlocked(int totalDamageBlocked) {
//		TotalDamageBlocked = TotalDamageBlocked;
//	}

	//Steel vest total defense method
	@Override public String TotalDefense(int damageblock) 
	{
		String result = new String();
		result = String.format("Standard Damage Blocked: %d DefenseBonus: %d Total damage blocked: ", this.DamageBlocked,  this.DefenseBonus,this.TotalDamageBlocked );
		
		return null;
	}
//	@Override public String toString() 
//	{
//		String result = new String();
//		result = String.format("Standard Damage Blocked: %d DefenseBonus: %d Total damage blocked: %d", this.DamageBlocked,  this.DefenseBonus, this.TotalDamageBlocked);
//		
//		return result;
//	}
	
	//Steel vest to string method
	@Override public String toString() 
	{
		String result = new String();
		result = String.format("%s TotalDamageBlocked: %d", this.DefenseName, this.TotalDamageBlocked);
			
		return result;
	}	
		
}
