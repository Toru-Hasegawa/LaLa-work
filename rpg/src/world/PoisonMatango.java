package world;

public class PoisonMatango extends Matango {

	public int pCount = 5;

	public PoisonMatango() {
		super();
	}

	public PoisonMatango(char suffix) {
		super(suffix);
	}

	public void attack(Hero h) {
		super.attack(h);
		if (this.pCount > 0) {
			System.out.println(this.suffix + "はさらに毒の胞子をばらまいた！");
			int dmg = h.hp / 5;
			h.hp -= dmg;
			System.out.println(h.name + "に" + dmg + "ポイントのダメージ！");
			this.pCount -= 1;
			System.out.println(h.name + "のHP:" + h.hp);
		}
	}
}
