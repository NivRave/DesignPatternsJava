package BehavioralPatterns.Command;

public class DivideCommand implements ICommand {
	private double operand;
	private Calculator calculator;

	public DivideCommand(Calculator calculator, double operand) {
		this.calculator = calculator;
		this.operand = operand;
	}

	@Override
	public void execute() {
		calculator.divide(operand);
	}

	@Override
	public void undo() {
		calculator.multiply(operand);
	}
}
