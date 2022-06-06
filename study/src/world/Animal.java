package world;

public class Animal {
	private String name;
	private int hp = 30;
	private boolean life = true;
	
	public Animal() {
		this.name = "アニマル";
	}
	public Animal(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println(this.name + "は食事中");
		System.out.println("眠ればhpが10回復");
	}
	
	public void sleep() {
		System.out.println(this.name + "は睡眠中");
		System.out.println("HPが10回復した");
		this.hp += 10;
	}
	
	public void bark () {
		System.out.println(this.name + "は鳴いた");
		System.out.println("HPを3使用した");
		this.hp -= 3;
	}
	
	public void dead() {
		System.out.println(this.name + "は死んだ。");
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
	public boolean isLife() {
		return life;
	}
	public void setLife(boolean life) {
		this.life = life;
	}

}

