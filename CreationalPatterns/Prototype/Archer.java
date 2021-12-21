package CreationalPatterns.Prototype;

public class Archer extends Unit {

	public Archer() {
		type = "Archer";
		range = 3;
		power = 2;
	}

	@Override
	public void showUnit() {
		System.out.println("Unit details");
		System.out.println("Type = " + type);
		System.out.println("Power = " + power);
		System.out.println("Range = " + range);
	}

	@Override
	public void addUnit() {
		System.out.println("New Archer added");
	}
}
