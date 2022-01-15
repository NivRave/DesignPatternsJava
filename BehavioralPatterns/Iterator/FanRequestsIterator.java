package BehavioralPatterns.Iterator;

public class FanRequestsIterator implements IAbstractIterator {
	private FanRequestsCollection requestsCollection;
	private int position;
	public int step;

	public FanRequestsIterator(FanRequestsCollection requestsCollection) {
		this.requestsCollection = requestsCollection;
		position = 0;
		step = 1;// Default step iterator
	}

	@Override
	public boolean hasNext() {
		return !(position >= requestsCollection.getLength());
	}

	@Override
	public Object Next() {// MAYBE RETURN CASTING
		position += step;
		if (hasNext()) {
			return requestsCollection.at(position);
		} else
			return null;
	}

	@Override
	public Object First() {
		position=0;
		return requestsCollection.at(position);
	}
}
