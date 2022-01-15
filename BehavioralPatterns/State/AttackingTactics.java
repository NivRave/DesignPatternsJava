package BehavioralPatterns.State;

public class AttackingTactics implements ITacticalState {

	@Override
	public void attack(TeamTactics tactics) {
		tactics.setState(new AllOutAttackTactics());
	}

	@Override
	public void defend(TeamTactics tactics) {
		tactics.setState(new BalancedTactics());
	}

	@Override
	public String toString() {
		return "Attacking";
	}

}
