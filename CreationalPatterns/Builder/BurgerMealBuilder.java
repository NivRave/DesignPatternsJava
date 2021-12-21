package CreationalPatterns.Builder;

public class BurgerMealBuilder {

	public BurgerMeal prepareBeefChipsCoke() {
		BurgerMeal meal = new BurgerMeal();
		meal.addItem(new BeefPatty());
		meal.addItem(new ChipsSide());
		meal.addItem(new SodaDrink());
		return meal;
	}
	
	public BurgerMeal prepareLambChipsCoke() {
		BurgerMeal meal = new BurgerMeal();
		meal.addItem(new LambPatty());
		meal.addItem(new ChipsSide());
		meal.addItem(new SodaDrink());
		return meal;
	}
	
	public BurgerMeal prepareBeefSaladsBeer() {
		BurgerMeal meal = new BurgerMeal();
		meal.addItem(new BeefPatty());
		meal.addItem(new SaladSide());
		meal.addItem(new BeerDrink());
		return meal;
	}
	
	public BurgerMeal prepareVeggieChipsBeer() {
		BurgerMeal meal = new BurgerMeal();
		meal.addItem(new VegPatty());
		meal.addItem(new ChipsSide());
		meal.addItem(new BeerDrink());
		return meal;
	}
}
