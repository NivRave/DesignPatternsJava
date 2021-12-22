package StructuralPatterns.Composite;

import java.util.ArrayList;

public class DirectoryItem implements StoredItem {
	private String name;
	private ArrayList<StoredItem> subItems = new ArrayList<StoredItem>();

	public DirectoryItem(String name) {
		this.name = name;
	}

	@Override
	public void Add(StoredItem item) {
		subItems.add(item);
		System.out.println(item.getName()+" added to " + name);
	}

	@Override
	public void remove(StoredItem item) {
		if (!subItems.remove(item)) {
			System.out.println("Item doesn't exist");
		}
		System.out.println(item.getName()+" removed from " + name);
	}

	@Override
	public void printContainingFiles(int tier) {

		for (int i = 0; i < tier; i++) {
			System.out.print("\t");
		}
		if (!subItems.isEmpty()) {
			System.out.println("Items in " + name + ":");
			for (StoredItem item : subItems) {
				item.printContainingFiles(tier + 1);
			}
		} else {
			System.out.println(name + " is empty");
		}
	}

	@Override
	public String getName() {
		return name;
	}

}
