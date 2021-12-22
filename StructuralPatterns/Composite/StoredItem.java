package StructuralPatterns.Composite;

public interface StoredItem {
	public void Add(StoredItem item);

	public void remove(StoredItem item);

	public void printContainingFiles(int tier);

	public String getName();
}