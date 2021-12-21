package CreationalPatterns.Builder;

public class BeerDrink extends Drinks {

	@Override
	public String name() {
		return "Drink - Beer";
	}

	@Override
	public double price() {
		return 15;
	}

}
