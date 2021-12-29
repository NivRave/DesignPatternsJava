package BehavioralPatterns.Observer;

public class BargainInvestor implements IInvestor {

	@Override
	public void update(Stock stock, double price) {
		if (price < 50) {
			buy(stock);
		}
		if (price > 150) {
			sell(stock);
		}
	}

	@Override
	public void buy(Stock stock) {
		System.out.println("Bargain investor buys " + stock);
	}

	@Override
	public void sell(Stock stock) {
		System.out.println("Bargain investor sells " + stock);
	}

}
