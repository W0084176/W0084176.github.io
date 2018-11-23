
public class GamePlay {
	private int diceRollAttackRound;
	private int diceRollDefenseRound;
	private int RoundNumber;
	private String whoWinsGame;
	private String whoWinsDiceRoll;
	
	public GamePlay (int diceRollAttackRound, int diceRollDefenseRound, int RoundNumber, String whoWinsGame, String whoWinsDiceRoll)
	{
		this.diceRollAttackRound = diceRollAttackRound;
		this.diceRollDefenseRound = diceRollDefenseRound;
		this.RoundNumber = RoundNumber;
		this.whoWinsGame = whoWinsGame;
		this.whoWinsDiceRoll = whoWinsDiceRoll;
	}

}
