package BehavioralPatterns.Observer;

public class ShortInvestor implements IInvestor {

	@Override
	public void update(Stock stock, double price) {
		if (price < 95) {
			buy(stock);
		}
		if (price > 105) {
			sell(stock);
		}
	}

	@Override
	public void buy(Stock stock) {
		System.out.println("Short investor buys " + stock);
	}

	@Override
	public void sell(Stock stock) {
		System.out.println("Short investor sells " + stock);
	}

}
