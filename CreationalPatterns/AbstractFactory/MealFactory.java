package CreationalPatterns.AbstractFactory;

public abstract class MealFactory {
	public abstract MainCourse createMainCourse();
	public abstract SideDish createSideDish();
}