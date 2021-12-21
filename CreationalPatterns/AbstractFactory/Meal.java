package CreationalPatterns.AbstractFactory;

public class Meal {
	private MainCourse main;
	private SideDish side;
	
	public Meal(MealFactory factory) {
		main=factory.createMainCourse();
		side=factory.createSideDish();
	}
	
	public void printMeal() {
		main.describe();
		side.describe();
	}
}
