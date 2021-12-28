package StructuralPatterns.Decorator;

public class TurboCarDecorator extends CarDecorator {

	public TurboCarDecorator(ICar car) {
		super(car);
	}
	
	@Override
	public void drive(){
		decoratedCar.drive();
		turboDrive();
	}

	//Added responsibility - drive fast with Turbo
	private void turboDrive() {
		System.out.println("The car drives fast because of the Turbo!");
	}

}
