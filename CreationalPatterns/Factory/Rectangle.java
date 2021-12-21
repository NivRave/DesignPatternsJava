package CreationalPatterns.Factory;

public class Rectangle implements IShape {

	double width, height;

	// Constructor
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("This is a Rectangle with a " + area() + " area");

	}

	@Override
	public double area() {
		return width * height;
	}

}
