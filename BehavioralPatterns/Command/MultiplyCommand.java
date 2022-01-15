package BehavioralPatterns.Command;

public class MultiplyCommand implements ICommand {
	private double operand;
	private Calculator calculator;

	public MultiplyCommand(Calculator calculator, double operand) {
		this.calculator = calculator;
		this.operand = operand;
	}

	@Override
	public void execute() {
		calculator.multiply(operand);
	}

	@Override
	public void undo() {
		calculator.divide(operand);
	}

}
