package BehavioralPatterns.Observer;

public class Watcher implements IInvestor {

	@Override
	public void update(Stock stock, double price) {
		System.out.println("Watcher - no action done, just watching...");
	}

	@Override
	public void buy(Stock stock) {
		// Never buy
	}

	@Override
	public void sell(Stock stock) {
		// Never sell
	}

}
