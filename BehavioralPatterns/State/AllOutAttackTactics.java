package BehavioralPatterns.State;

public class AllOutAttackTactics implements ITacticalState {

	@Override
	public void attack(TeamTactics tactics) {
		System.out.println("Can't be any more offensive than that!");
	}

	@Override
	public void defend(TeamTactics tactics) {
		tactics.setState(new AttackingTactics());
	}

	@Override
	public String toString() {
		return "All Out Attack";
	}
}
