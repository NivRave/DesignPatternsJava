package CreationalPatterns.Prototype;

public class Infantry extends Unit {

	public Infantry() {
		type = "Infantry";
		range = 1;
		power = 1;
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
		System.out.println("New Infantry added");
	}
}
