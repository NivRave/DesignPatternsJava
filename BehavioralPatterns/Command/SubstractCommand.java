package BehavioralPatterns.Command;

public class SubstractCommand implements ICommand {
	private double operand;
	private Calculator calculator;

	public SubstractCommand(Calculator calculator, double operand) {
		this.calculator = calculator;
		this.operand = operand;
	}

	@Override
	public void execute() {
		calculator.substract(operand);
	}

	@Override
	public void undo() {
		calculator.add(operand);
	}

}
