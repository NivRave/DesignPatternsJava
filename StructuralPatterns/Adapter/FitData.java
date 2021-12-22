package StructuralPatterns.Adapter;

public class FitData implements IUsFormat {

	@Override
	public double getSpeed() {
		return 25;
	}

	@Override
	public double getWeight() {
		return 185;
	}

}
