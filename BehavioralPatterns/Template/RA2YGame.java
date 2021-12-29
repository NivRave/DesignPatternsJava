package BehavioralPatterns.Template;

public class RA2YGame extends ComputerGame {

	@Override
	protected void activateGame() {
		System.out.println("Red Alert 2: Yuri's Revenge loading...");
	}

	@Override
	protected void startGame() {
		System.out.println("Red Alert 2: Yuri's Revenge ready to play!");
	}

	@Override
	protected void endGame() {
		System.out.println("Red Alert 2: Yuri's Revenge Game Finished");
	}

}
