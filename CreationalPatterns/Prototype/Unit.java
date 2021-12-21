package CreationalPatterns.Prototype;

public abstract class Unit implements Cloneable {
	protected int power;
	protected int range;
	protected String type;

	public int getPower() {
		return power;
	}

	public int getRange() {
		return range;
	}

	public String getType() {
		return type;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public void setType(String type) {
		this.type = type;
	}

	public abstract void showUnit();
	
	public abstract void addUnit();
	
	public Object clone() {
		Object clone = null;

		try {
			clone = super.clone();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return clone;
	}

}
