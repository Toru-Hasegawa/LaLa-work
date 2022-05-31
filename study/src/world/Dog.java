package world;

public class Dog extends Animal {
	
	public void bark () {
		System.out.println(this.name + "は遠吠えをあげた");
		System.out.println("HPを5使用した");
		this.hp -= 5;
	}
	
	public void run() {
		System.out.println(this.name + "は走った！");
		System.out.println("HPを5使用した");
		this.hp -= 5;
		if (this.hp < 1) {
			dead();
		}
	}
}
