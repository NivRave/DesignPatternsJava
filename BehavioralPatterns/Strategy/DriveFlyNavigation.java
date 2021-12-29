package BehavioralPatterns.Strategy;

public class DriveFlyNavigation implements INavigationStrategy {

	@Override
	public String getNavigationPath(String start, String finish) {
		return "Drive from " + start + " to middle point and than fly to " + finish;
	}

}
