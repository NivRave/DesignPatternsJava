package BehavioralPatterns.Observer;

import java.util.LinkedList;

//Subject abstract class
public abstract class Stock {
	private String symbol;
	private double price;
	private LinkedList<IInvestor> investors;

	// Constructor
	public Stock(String symbol, double price) {
		this.symbol = symbol;
		this.price = price;
		investors = new LinkedList<IInvestor>();
	}

	// Attach method to add a new IInvestor (Observer) to the subject's observers
	// list
	public void attach(IInvestor investor) {
		investors.add(investor);
	}

	// Detach method to remove an existing IInvestor (Observer) from the subject's
	// observers list
	public void detach(IInvestor investor) {
		investors.remove(investor);
	}

	// Notify all the observers attached to this subject of a change - invoke each
	// observer's update() method to handle the change as it needs to
	protected void update() {
		for (IInvestor investor : investors) {
			investor.update(this, price);
		}
	}

	public void setPrice(double price) {
		System.out.println("--Stock " + symbol + " price changed from " + this.price + " to " + price + "--");
		this.price = price;
		update();
	}

	@Override
	public String toString() {
		return "Stock [symbol=" + symbol + ", price=" + price + "]";
	}

}
