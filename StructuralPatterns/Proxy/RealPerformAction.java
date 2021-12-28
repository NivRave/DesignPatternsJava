package StructuralPatterns.Proxy;

public class RealPerformAction implements IServerActions {

	@Override
	public void performAction(String action) {
		System.out.println(action.toUpperCase() + " performed");
	}

}
