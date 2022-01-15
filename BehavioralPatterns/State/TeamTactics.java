package BehavioralPatterns.State;

public class TeamTactics {
	ITacticalState state;

	public TeamTactics() {
		state = new BalancedTactics();
	}

	// "next" state
	public void attack() {
		state.attack(this);
	}

	// "previous" state
	public void defend() {
		state.defend(this);
	}

	public void setState(ITacticalState state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "The current tactics is " + state;
	}

}
