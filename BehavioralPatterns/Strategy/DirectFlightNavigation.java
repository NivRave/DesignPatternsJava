package BehavioralPatterns.Strategy;

public class DirectFlightNavigation implements INavigationStrategy {

	@Override
	public String getNavigationPath(String start, String finish) {
		return "Fly from " + start + " to " + finish;
	}

}
