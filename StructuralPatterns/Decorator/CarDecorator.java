package StructuralPatterns.Decorator;

public abstract class CarDecorator implements ICar {

	protected ICar decoratedCar;

	// Constructor
	public CarDecorator(ICar car) {
		this.decoratedCar = car;
	}

	//Overriden drive() method - call the original and add responsibility
	@Override
	public void drive() {
		decoratedCar.drive();
	}

}
