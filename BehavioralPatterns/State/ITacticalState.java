package BehavioralPatterns.State;

public interface ITacticalState {
	public void attack(TeamTactics tactics);
	public void defend(TeamTactics tactics);
	public String toString();
}
