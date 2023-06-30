public class HealersMonk extends AbstractHealers {
	String special;
	
	public HealersMonk(String name) {
		super(name, "Monk", 30, 5, 2,
				1, 13, 100, 10);
		this.special = "Meditation";
	}

	public void printParameters() {
		System.out.println("Type hero: " + typeHero);
		System.out.println("Name hero: " + nameHero);
		System.out.println("Max hit points: " + maxHitPoints);
		System.out.println("Max mana points: " + maxManaPoints);
		System.out.println("Damage: " + damage);
		System.out.println("Armor: " + armor);
		System.out.println("Range attack: " + rangeAttack);
		System.out.println("Initiative: " + initiative);
		System.out.println("Special movement: " + special);
	}
}