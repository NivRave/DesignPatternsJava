package StructuralPatterns.Proxy;

public class ProxyPerformAction implements IServerActions {
	boolean isAdmin;
	RealPerformAction perfomActionUtil;

	public ProxyPerformAction(boolean isAdmin) {
		this.isAdmin = isAdmin;
		perfomActionUtil = new RealPerformAction();
	}

	@Override
	public void performAction(String action) {
		if (isAdmin) {// Admin can perform any read/add/delete actions
			perfomActionUtil.performAction(action);
		} else {// Non admin users can only read and cannot add/delete
			if (action.toUpperCase().equals("READ")) {
				perfomActionUtil.performAction(action);
			} else {
				System.out.println("Regular users can only read! " + action.toUpperCase() + " not performed");

			}
		}
	}

}
