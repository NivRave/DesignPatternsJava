package CreationalPatterns.Factory;

public class ShapeFactory {

	public IShape createShape(String type, double... args) {
		if (type == null) {
			return null;
		}
		if (type.equalsIgnoreCase("CIRCLE")) {
			return new Circle(args[0]);
		} else if (type.equalsIgnoreCase("Triangle")) {
			return new Triangle(args[0], args[1]);
		} else if (type.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle(args[0], args[1]);
		}
		return null;
	}
}
