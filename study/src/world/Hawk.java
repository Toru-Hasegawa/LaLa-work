package world;

public class Hawk extends Animal {
	
	public void fly() {
		System.out.println(this.name + "は飛び上がった！");
		System.out.println("HPを5使用した");
		this.hp -= 5;
	}
	
	public void land() {
		System.out.println(this.name + "は着地した！");
	}
}
