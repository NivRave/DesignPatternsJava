package BehavioralPatterns.Template;

public class AOE2Game extends ComputerGame {

	@Override
	protected void activateGame() {
		System.out.println("Age of empires 2 loading...");
	}

	@Override
	protected void startGame() {
		System.out.println("Game loaded - Age of emipres 2 ready to play!");
	}

	@Override
	protected void endGame() {
		System.out.println("Age of emipres 2 Game Finished");
	}
}
