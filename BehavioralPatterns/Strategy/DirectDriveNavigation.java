package BehavioralPatterns.Strategy;

public class DirectDriveNavigation implements INavigationStrategy {

	@Override
	public String getNavigationPath(String start, String finish) {
		return "Drive from " + start + " to " + finish;
	}

}
