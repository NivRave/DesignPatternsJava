package CreationalPatterns.AbstractFactory;

public class Steak implements MainCourse {

	@Override
	public void describe() {
		System.out.println("You get a steak " + type() + " main course.");
	}

	@Override
	public String type() {
		return "meat";
	}

}
