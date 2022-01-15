package BehavioralPatterns.Iterator;

public interface IAbstractCollection {
	public IAbstractIterator createIterator();
	public int getLength();
	public Object at(int index);
}
