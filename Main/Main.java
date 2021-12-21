package Main;

import java.util.ArrayList;

import CreationalPatterns.Factory.*;
import CreationalPatterns.AbstractFactory.*;
import CreationalPatterns.Builder.*;
import CreationalPatterns.Prototype.*;
import CreationalPatterns.Singleton.*;

public class Main {

	public static void main(String[] args) {

		/* Creational design patterns */
		/* Factory Pattern: */
		System.out.println("The output for the Factory pattern example:");
		ArrayList<IShape> factoryShapes = new ArrayList<IShape>();
		ShapeFactory shapeFactory = new ShapeFactory();// Create factory instance
		// Specific shapes creation using ShapeFactory
		IShape circle = shapeFactory.createShape("circle", 2);// Create circle with radius 2
		IShape triangle = shapeFactory.createShape("triangle", 2, 6);// Create triangle with w=2, h=6
		IShape rectrangle = shapeFactory.createShape("rectangle", 5, 14);// Create rectangle with w=5, h=14
		// Add to ArrayList and draw using enhanced for loop
		factoryShapes.add(circle);
		factoryShapes.add(rectrangle);
		factoryShapes.add(triangle);
		for (IShape shape : factoryShapes) {// Draw all shapes
			shape.draw();
		}
		System.out.println();
		System.out.println();

		/* Abstract Factory Pattern: */
		System.out.println("The output for the Abstract Factory pattern example:");
		MealFactory meat = new MeatMealFactory();// Create meat type Meal factory instance
		MealFactory vegeterian = new VegeterianMealFactory();// Create veggie type Meal factory instance
		Meal meatMeal = new Meal(meat);// Create meal meal using the meat factory
		Meal vegMeal = new Meal(vegeterian);// Create veggie meal using the veggie factory
		System.out.println("The description for the meat meal:");
		meatMeal.printMeal();
		System.out.println("\nThe description for the vegeterian meal:");
		vegMeal.printMeal();
		System.out.println();
		System.out.println();

		/* Builder Pattern: */
		System.out.println("The output for the Builder pattern example:");
		BurgerMealBuilder builder = new BurgerMealBuilder();// Create Builder instance
		BurgerMeal beefChipsCoke = builder.prepareBeefChipsCoke();// Build beef+chips+coke meal
		BurgerMeal lambChipsCoke = builder.prepareLambChipsCoke();// Build lamb+chips+coke
		BurgerMeal veggieChipsBeer = builder.prepareVeggieChipsBeer();// Build veggie+chips+beer
		System.out.println("The description for the beef+chips+coke meal:");
		beefChipsCoke.showMeal();
		System.out.println();
		System.out.println("The description for the lamb+chips+coke meal:");
		lambChipsCoke.showMeal();
		System.out.println();
		System.out.println("The description for the veggie+chips+beer meal:");
		veggieChipsBeer.showMeal();
		System.out.println();
		System.out.println();

		/* Prototype Pattern: */
		System.out.println("The output for the Prototype pattern example:");
		UnitPrototypesCache.setCache();// Load prototypes to cache
		ArrayList<Unit> army = new ArrayList<Unit>();
		Unit infantry1 = (Unit) UnitPrototypesCache.getUnit("0");// Clone infantry
		army.add(infantry1);
		Unit infantry2 = (Unit) UnitPrototypesCache.getUnit("0");// Clone infantry
		army.add(infantry2);
		Unit archer = (Unit) UnitPrototypesCache.getUnit("1");// Clone archer
		army.add(archer);
		Unit knight = (Unit) UnitPrototypesCache.getUnit("2");// Clone knight
		army.add(knight);
		for (int i = 0; i < 4; i++) {
			System.out.print("#" + (i + 1) + " ");
			army.get(i).showUnit();
		}
		System.out.println();
		System.out.println();

		/* Singleton Pattern: */
		System.out.println("The output for the Singleton pattern example:");
		Logger logger1 = Logger.getInstance();// Get the only instance of the Logger - if doesn't exist, will create
												// one.
		// Logger logger2 = new Logger(); - Illegal attempt of creating a new Logger
		// entity using the constructor - will not run the program
		logger1.log("Log 1");// Log in logger1
		logger1.log("Log 2");// Log in logger1
		logger1.log("Log 3");// Log in logger1
		System.out.println("Log file from logger1");
		for (String msg : logger1.getLog()) {
			System.out.println(msg);
		}
		System.out.println();
		Logger logger2 = Logger.getInstance();// Get the only instance of the Logger
		System.out.println("Log file from logger2");
		for (String msg : logger2.getLog()) {
			System.out.println(msg);
		}
		logger2.log("Log4");// Log in logger2
		System.out.println(
				"The log Arraylist is equal between logger1 & logger2: " + logger1.getLog().equals(logger2.getLog()));

	}
}
