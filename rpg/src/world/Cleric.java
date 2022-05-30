package world;

import java.util.Random;

public class Cleric {
	String name;
	int hp = 50;
	final int HP_MAX = 50;
	int mp = 10;
	final int MP_MAX = 10;

	public void selfAid() {
		this.mp -= 5;
		this.hp = this.HP_MAX;
		System.out.println("聖職者は「セルフエイド」という魔法を使った。");
		System.out.println("HPが最大値(50)まで回復した。");
		System.out.println("MPを5使った。");
	}
	
	/**
	 * 聖職者は祈ることで自分のMPを回復できる。
	 * 回復量は祈る秒数+ランダム（3未満）
	 * ただし、最大MPを超えることはない。
	 * @param sec int 祈る秒数
	 * @return int 回復量
	 */
	public int pray(int sec) {
		int hosei = new Random().nextInt(3);
		int kaifuku = sec + hosei;
		// this.mp = this.mp + kaifuku;
		if ((this.mp + kaifuku) > MP_MAX) {
			kaifuku = MP_MAX - this.mp;
			this.mp = MP_MAX;
		}
		this.mp = this.mp + kaifuku;
		System.out.println("聖職者は" + sec + "秒祈った");
		System.out.println("MPが" + kaifuku + "回復した。");
		return kaifuku; //あとで変更
	}
}
