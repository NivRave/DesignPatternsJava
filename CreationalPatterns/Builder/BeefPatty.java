package CreationalPatterns.Builder;

public class BeefPatty extends Patty {

	@Override
	public String name() {
		return "Burger - Beef";
	}

	@Override
	public double price() {
		return 25;
	}

}
