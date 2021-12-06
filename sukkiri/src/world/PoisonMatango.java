package world;

public class PoisonMatango extends Matango {
	int count = 5;
	
	public PoisonMatango(char suffix) {
		// this.suffix = suffix;
		super(suffix);
	}
	
	public void attack(Hero h) {
		super.attack(h);
		if (this.count > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int damage = h.hp / 5;
			h.hp = h.hp - damage;
			System.out.println(damage + "ポイントのダメージ");
			this.count--;
		} else {
			System.out.println("毒攻撃はもうできません");
		}
	}
}
