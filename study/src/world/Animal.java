package world;

public class Animal {
	public String name;
	public int hp = 30;
	
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

}

