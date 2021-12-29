package BehavioralPatterns.Strategy;

//The context class
public class Navigate {
	private String startDestination;
	private String finishDestination;
	private INavigationStrategy navStrategy;// Instance of the strategy interface where a specific getNavigationPath()
											// is implemented

	// Constructor
	public Navigate(String startDestination, String finishDestination) {
		this.startDestination = startDestination;
		this.finishDestination = finishDestination;
		navStrategy = null;
	}

	// Navigate method that invokes the chosen concrete strategy getNavigationPath()
	// method
	public void navigate() {
		if (navStrategy != null) {
			System.out.println(navStrategy.getNavigationPath(startDestination, finishDestination));
		} else {
			System.out.println("Define a concrete strategy before navigating");
		}
	}

	// New strategy setter
	public void setStrategy(INavigationStrategy navStrategy) {
		this.navStrategy = navStrategy;
	}
}
