package CreationalPatterns.Prototype;

public class Knight extends Unit {

	public Knight() {
		type = "Knight";
		range = 2;
		power = 5;
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
		System.out.println("New knight added");
	}
}
