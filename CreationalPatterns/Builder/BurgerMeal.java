package CreationalPatterns.Builder;

import java.util.ArrayList;

public class BurgerMeal {
	private ArrayList<Item> ingredients = new ArrayList<Item>();

	public void addItem(Item item) {
		ingredients.add(item);
	}

	public double getTotalCost() {
		double cost = 0;

		for (Item ingredient : ingredients) {
			cost += ingredient.price();
		}

		return cost;
	}

	public void showMeal() {
		System.out.println("The meal contains:");
		for (Item ingredient : ingredients) {
			System.out.println(ingredient.name());
		}
		System.out.println("Total cost: " + getTotalCost());
	}
}
