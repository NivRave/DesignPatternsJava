package BehavioralPatterns.Command;

import java.util.ArrayList;
import java.util.List;

//The invoker class
public class CommandsManager {
	private List<ICommand> calculatorOperations;
	private int currentCommand;

	public CommandsManager() {
		calculatorOperations = new ArrayList<ICommand>();
		currentCommand = 0;
	}

	public void compute(ICommand command) {
		command.execute();
		calculatorOperations.add(command);
		currentCommand++;
	}

	public void undo(int steps) {
		int undoSteps = steps > currentCommand ? currentCommand + 1 : steps;
		System.out.println(String.format("Undo %d steps:", undoSteps));
		for (int i = 0; i < steps; i++) {
			if (currentCommand > 0) {
				calculatorOperations.get(--currentCommand).undo();
			}
		}
	}

	public void redo(int steps) {
		int redoSteps = (steps > calculatorOperations.size() - currentCommand)
				? calculatorOperations.size() - currentCommand
				: steps;
		System.out.println(String.format("Redo %d steps:", redoSteps));
		for (int i = 0; i < steps; i++) {
			if (currentCommand < calculatorOperations.size()) {
				calculatorOperations.get(currentCommand++).execute();
			}
		}
	}

}