package CreationalPatterns.AbstractFactory;

public class Pasta implements MainCourse {

	@Override
	public void describe() {
		System.out.println("You get a pasta " + type() + " main course.");
	}

	@Override
	public String type() {
		return "vegeterian";
	}

}
