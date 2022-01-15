package BehavioralPatterns.State;

public class ParkTheBusTactics implements ITacticalState {

	@Override
	public void attack(TeamTactics tactics) {
		tactics.setState(new DefendingTactics());
	}

	@Override
	public void defend(TeamTactics tactics) {
		System.out.println("Can't be any more defensive than that!");
	}

	@Override
	public String toString() {
		return "Park The Bus";
	}

}
