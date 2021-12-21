package CreationalPatterns.Factory;

public class Circle implements IShape {

	double radius;

	// Constructor
	Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("This is a Circle with a " + area() + " area");
	}

	@Override
	public double area() {
		return 3.14 * radius * radius;
	}

}
