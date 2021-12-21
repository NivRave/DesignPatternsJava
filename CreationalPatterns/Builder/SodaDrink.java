package CreationalPatterns.Builder;

public class SodaDrink extends Drinks {

	@Override
	public String name() {
		return "Drink - Soda";
	}

	@Override
	public double price() {
		return 12;
	}

}
