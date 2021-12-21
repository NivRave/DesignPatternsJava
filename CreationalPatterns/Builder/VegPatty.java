package CreationalPatterns.Builder;

public class VegPatty extends Patty {

	@Override
	public String name() {
		return "Burger - Veggie";
	}

	@Override
	public double price() {
		return 23;
	}

}
