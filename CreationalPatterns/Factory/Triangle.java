package CreationalPatterns.Factory;

public class Triangle implements IShape {

	double width, height;

	// Constructor
	Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("This is a Triangle with a " + area() + " area");

	}

	@Override
	public double area() {
		return width * height / 2;
	}

}
