package BehavioralPatterns.Observer;
//Observer interface
public interface IInvestor {
	public void update(Stock stock, double price);
	public void buy(Stock stock);
	public void sell(Stock stock);
}
