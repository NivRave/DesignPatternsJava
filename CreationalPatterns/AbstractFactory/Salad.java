package CreationalPatterns.AbstractFactory;

public class Salad implements SideDish {

	@Override
	public void describe() {
		System.out.println("It comes with a salad side dish.");
	}
}
