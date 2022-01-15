package BehavioralPatterns.Iterator;

import java.util.ArrayList;

public class FanRequestsCollection implements IAbstractCollection {
	private ArrayList<FanRequest> requests;
	private int requestsCount;

	public FanRequestsCollection() {
		requests = new ArrayList<FanRequest>();
		requestsCount = 0;
	}

	public void addRequest(FanRequest requet) {
		requests.add(requet);
		requestsCount++;
	}
	
	@Override
	public Object at(int index) {
		return requests.get(index);
	}
	
	@Override
	public int getLength() {
		return requestsCount;
	}

	@Override
	public FanRequestsIterator createIterator() {
		return new FanRequestsIterator(this);
	}

}
