package BehavioralPatterns.State;

public class BalancedTactics implements ITacticalState {

	@Override
	public void attack(TeamTactics tactics) {
		tactics.setState(new AttackingTactics());
	}

	@Override
	public void defend(TeamTactics tactics) {
		tactics.setState(new DefendingTactics());
	}

	@Override
	public String toString() {
		return "Balanced";
	}

}
