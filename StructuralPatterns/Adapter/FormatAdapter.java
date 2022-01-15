package StructuralPatterns.Adapter;

public class FormatAdapter implements IEUFormat {

	IUsFormat usFormatData;
	
	public FormatAdapter(IUsFormat usFormatData) {
		this.usFormatData = usFormatData;
	}

	@Override
	public double getSpeed() {
		return usFormatData.getSpeed() * 1.6;
	}

	@Override
	public double getWeight() {
		return usFormatData.getWeight() * 0.45359237;
	}

}
