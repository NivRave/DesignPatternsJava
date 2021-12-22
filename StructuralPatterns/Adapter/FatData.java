package StructuralPatterns.Adapter;

public class FatData implements IUsFormat {

	@Override
	public double getSpeed() {
		return 12;
	}

	@Override
	public double getWeight() {
		return 240;
	}

}
