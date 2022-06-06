package world;

public class Main {

	public static void main(String[] args) {
		Dog pochi = new Dog();
		pochi.setName("ポチ");
		pochi.bark();
		pochi.run();
		

		Hawk taro = new Hawk();
		taro.setName("太郎");
		taro.fly();
		taro.land();
		taro.eat();
		taro.sleep();

	}

}
