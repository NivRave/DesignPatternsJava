package BehavioralPatterns.Template;

public abstract class ComputerGame {

	// Template method - Will run the 3 defined primitive operations in order
	// PO1->PO2->PO3
	public void playGame() {
		activateGame();
		startGame();
		endGame();
	}

	// Primitive operation 1 - must be implemented by the concrete class
	protected abstract void activateGame();

	// Primitive operation 2 - must be implemented by the concrete class
	protected abstract void startGame();

	// Primitive operation 3 - must be implemented by the concrete class
	protected abstract void endGame();

}
