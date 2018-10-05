import java.util.ArrayList;

public class Application extends Object{
	public void start()
	{
		
		//Footman myFootman = new Footman(100, "Attacker", "Human", new Sword(10,5), new Shield(10,5), 10, 10, 10,10, "Footman");
		
		//Grunt myGrunt = new Grunt(120, "Defense", "Orc", new Sword(10,5), new Shield(10,5), 10,10, 10, 10, "Grunt");
		
		ArrayList<Human>HumansBattle = new ArrayList<Human>();
		ArrayList<Orc>OrcBattle = new ArrayList<Orc>();

		//HumansBattle.add(myFootman);
		//OrcBattle.add(myGrunt);
		
		for(int i=0;i<HumansBattle.size(); i++)
		{
			System.out.println(HumansBattle.get(i).ShowInfo());
		}
		for(int i=0;i<OrcBattle.size(); i++)
		{
			System.out.println(OrcBattle.get(i).ShowInfo());
		}
		
	}

}
