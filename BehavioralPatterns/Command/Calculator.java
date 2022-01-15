package BehavioralPatterns.Command;

//The reciever class

public class Calculator {
	private double value;

	public Calculator() {
		value = 0;
	}

	public void add(double operand) {
		value += operand;
	}

	public void substract(double operand) {
		value -= operand;
	}

	public void multiply(double operand) {
		value *= operand;
	}

	public void divide(double operand) {
		if (operand != 0)
			value /= operand;
	}

	@Override
	public String toString() {
		return "Calculator [value=" + value + "]";
	}
}
