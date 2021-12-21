package CreationalPatterns.AbstractFactory;

public class MeatMealFactory extends MealFactory {

	@Override
	public MainCourse createMainCourse() {
		return new Steak();
	}

	@Override
	public SideDish createSideDish() {
		return new ChickenSoup();
	}

}
