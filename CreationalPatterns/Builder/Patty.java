package CreationalPatterns.Builder;

public abstract class Patty implements Item {

	@Override
	public abstract String name();

	@Override
	public abstract double price();

}
