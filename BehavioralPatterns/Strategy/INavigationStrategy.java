package BehavioralPatterns.Strategy;

//The strategy interface
public interface INavigationStrategy {
	public String getNavigationPath(String start, String finish);
}
