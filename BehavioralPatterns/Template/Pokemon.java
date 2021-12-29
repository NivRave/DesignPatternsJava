package BehavioralPatterns.Template;

public class Pokemon {
	private String name;
	private int hp;
	private Attack attack1;
	private Attack attack2;

	public Pokemon(String name, int hp, Attack attack1, Attack attack2) {
		this.name = name;
		this.hp = hp;
		this.attack1 = attack1;
		this.attack2 = attack2;
	}

	public int attack(int attack) {
		switch (attack) {
		case 1: {
			System.out.println(name + " attacks: " + attack1);
			return attack1.getDamage();
		}
		case 2: {
			System.out.println(name + " attacks: " + attack2);
			return attack2.getDamage();
		}
		default:
			System.out.println(name + " attacks: " + attack1);
			return attack1.getDamage();
		}

	}

	public int getHp() {
		return hp;
	}

}

class Attack {
	private String attack;
	private int damage;

	public Attack(String attack, int damage) {
		this.attack = attack;
		this.damage = damage;
	}

	public int getDamage() {
		return damage;
	}

	@Override
	public String toString() {
		return "Attack " + attack + ", damage=" + damage;
	}

}