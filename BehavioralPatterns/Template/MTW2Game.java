package BehavioralPatterns.Template;

public class MTW2Game extends ComputerGame {

	@Override
	protected void activateGame() {
		System.out.println("Medeival total war 2 loading...");
	}

	@Override
	protected void startGame() {
		System.out.println("Game loaded - Medeival total war 2 ready to play!");
	}

	@Override
	protected void endGame() {
		System.out.println("Medeival total war 2 Game Finished");
	}

}
