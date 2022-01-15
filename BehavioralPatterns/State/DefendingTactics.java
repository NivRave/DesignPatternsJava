package BehavioralPatterns.State;

public class DefendingTactics implements ITacticalState {

	@Override
	public void attack(TeamTactics tactics) {
		tactics.setState(new BalancedTactics());
	}

	@Override
	public void defend(TeamTactics tactics) {
		tactics.setState(new ParkTheBusTactics());
	}

	@Override
	public String toString() {
		return "Defending";
	}

}
