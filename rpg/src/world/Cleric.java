package world;

import java.util.Objects;
import java.util.Random;

public class Cleric {
	private String name;
	int hp = 50;
	public static final int HP_MAX = 50;
	private int mp = 10;
	public static final int MP_MAX = 10;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public static int getHpMax() {
		return HP_MAX;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hp, mp, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cleric other = (Cleric) obj;
		return hp == other.hp && mp == other.mp && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Cleric [name=" + name + ", hp=" + hp + ", mp=" + mp + "]";
	}
}
