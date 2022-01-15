package BehavioralPatterns.Command;

public class AddCommand implements ICommand {
	private double operand;
	private Calculator calculator;

	public AddCommand(Calculator calculator, double operand) {
		this.calculator = calculator;
		this.operand = operand;
	}

	@Override
	public void execute() {
		calculator.add(operand);
	}

	@Override
	public void undo() {
		calculator.substract(operand);
	}

}
