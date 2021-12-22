package StructuralPatterns.Composite;

public class FileItem implements StoredItem {
	private String name;

	public FileItem(String name) {
		this.name = name;
	}

	@Override
	public void Add(StoredItem item) {
		System.out.println("ERROR!!!! Can't add to file!");
	}

	@Override
	public void remove(StoredItem item) {
		System.out.println("ERROR!!!! Can't remove from file!");
	}

	@Override
	public void printContainingFiles(int tier) {
		for (int i = 0; i < tier; i++) {
			System.out.print("\t");
		}
		System.out.println("File - " + name);
	}

	@Override
	public String getName() {
		return name;
	}

}
