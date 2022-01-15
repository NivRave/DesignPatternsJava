package BehavioralPatterns.Command;

//Client class
public class User {
	private CommandsManager commandsManager;
	private Calculator calculator;

	public User() {
		commandsManager = new CommandsManager();
		calculator = new Calculator();
	}

	public void compute(char operator, double operand) {
		switch (operator) {
		case '+':
			commandsManager.compute(new AddCommand(calculator, operand));
			break;
		case '-':
			commandsManager.compute(new SubstractCommand(calculator, operand));
			break;
		case '*':
			commandsManager.compute(new MultiplyCommand(calculator, operand));
			break;
		case '/':
			commandsManager.compute(new DivideCommand(calculator, operand));
			break;
		}
	}
	
	public void undo(int steps) {
		commandsManager.undo(steps);
	}
	
	public void redo(int steps) {
		commandsManager.redo(steps);
	}

	public void printCalculatorValue() {
		System.out.println(calculator);
	}
}
