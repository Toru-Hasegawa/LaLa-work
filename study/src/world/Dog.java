package world;

public class Dog extends Animal {
	
	public void bark () {
		System.out.println(this.getName() + "は遠吠えをあげた");
		System.out.println("HPを5使用した");
		this.setHp(this.getHp() - 5);
	}
	
	public void run() {
		System.out.println(this.getName() + "は走った！");
		System.out.println("HPを5使用した");
		this.setHp(this.getHp() - 5);
		if (this.getHp() < 1) {
			dead();
		}
	}
}
