package CreationalPatterns.Builder;

public class SaladSide extends Sides {

	@Override
	public String name() {
		return "Side Dish - Salad";
	}

	@Override
	public double price() {
		return 8;
	}

}
