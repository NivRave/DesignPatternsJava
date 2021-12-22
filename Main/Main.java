package Main;

import java.util.ArrayList;

import CreationalPatterns.Factory.*;
import CreationalPatterns.AbstractFactory.*;
import CreationalPatterns.Builder.*;
import CreationalPatterns.Prototype.*;
import CreationalPatterns.Singleton.*;
import StructuralPatterns.Adapter.*;
import StructuralPatterns.Composite.*;

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
		System.out.println();
		System.out.println();
		
		/* Structural design patterns */
		/* Adapter Pattern: */
		IUsFormat fit = new FitData();// US format data
		IUsFormat fat = new FatData();// US format data
		FormatAdapter fitAdapter = new FormatAdapter(fit);// Eu adapted format data
		FormatAdapter fatAdapter = new FormatAdapter(fat);// Eu adapted format data
		System.out.println("Data in Us format (MPH + Lbs):");
		System.out.println("Fit: Speed = " + fit.getSpeed() + ", Weight = " + fit.getWeight());
		System.out.println("Fat: Speed = " + fat.getSpeed() + ", Weight = " + fat.getWeight());
		System.out.println("Data in Us format (KMH + KG):");
		System.out.println("Fit: Speed = " + String.format("%.2f",fitAdapter.getSpeed()) + ", Weight = " + String.format("%.2f",fitAdapter.getWeight()));
		System.out.println("Fat: Speed = " + String.format("%.2f",fatAdapter.getSpeed()) + ", Weight = " + String.format("%.2f",fatAdapter.getWeight()));
		System.out.println();
		System.out.println();
		
		/* Composite Pattern: */
		StoredItem mainDir = new DirectoryItem("Dir 1 in Tier 1");//Main dir
		StoredItem subDir1 = new DirectoryItem("Dir 1 in Tier 2");//Nested in Tier 1
		StoredItem subDir2 = new DirectoryItem("Dir 1 in Tier 3");//Nested in Tier 2
		StoredItem subDir3 = new DirectoryItem("Dir 2 in Tier 3");//Nested in Tier 2
		StoredItem mainFile1 = new FileItem("File1 in Tier 1");
		StoredItem mainFile2 = new FileItem("File2 in Tier 1");
		StoredItem subFile1 = new FileItem("File1 in Tier 2");
		StoredItem subFile2 = new FileItem("File1 in Tier 3");
		StoredItem subFile3 = new FileItem("File1 in Tier 3");

		//Chain directories
		mainDir.Add(subDir1);
		subDir1.Add(subDir2);
		subDir1.Add(subDir3);
		//Add files to desired directories
		mainDir.Add(mainFile1);
		mainDir.Add(mainFile2);
		subDir1.Add(subFile1);
		subDir2.Add(subFile2);
		subDir2.Add(subFile3);
		System.out.println();

		//Print hierarchy - starting from Main directory. Will print each file and Recursively print the nested files in each directory 
		mainDir.printContainingFiles(0);
		
		System.out.println();
		mainFile1.Add(subFile1);//Invalid addition - cannot add to file, only to directory
		mainDir.remove(mainFile1);//Remove from directory - will work
		mainFile2.remove(subFile3);//Invalid removal - cannot remove from file, only from directory
	}
}
