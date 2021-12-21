package CreationalPatterns.AbstractFactory;

public class VegeterianMealFactory extends MealFactory {

	@Override
	public MainCourse createMainCourse() {
		return new Pasta();
	}

	@Override
	public SideDish createSideDish() {
		return new Salad();
	}

}
