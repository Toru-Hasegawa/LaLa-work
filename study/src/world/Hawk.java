package world;

public class Hawk extends Animal {
	
	public void fly() {
		System.out.println(this.getName() + "は飛び上がった！");
		System.out.println("HPを5使用した");
		this.setHp(this.getHp() - 5);
	}
	
	public void land() {
		System.out.println(this.getName() + "は着地した！");
	}
}
