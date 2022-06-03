package world;

public class Matango {
	public int hp = 50;
	public char suffix;
	
	public Matango() {
		this.suffix = 'A';
	}
	public Matango(char suffix) {
		this.suffix = suffix;
	}
	public void attack(Hero h) {
		System.out.println(this.suffix + "の攻撃");
		System.out.println(h.getName() + "に10のダメージ");
		// h.hp -=10;
		// System.out.println(h.name + "のHP:" + h.hp);
	}
}
