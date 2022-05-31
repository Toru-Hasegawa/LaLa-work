package main;

import world.Dog;
import world.Hawk;

public class Main {

	public static void main(String[] args) {
		Dog pochi = new Dog();
		pochi.name = "ポチ";
		pochi.bark();
		for (int i = 0; i < 10; i++) {
		pochi.run();
		}

		Hawk taro = new Hawk();
		taro.name = "太郎";
		taro.fly();
		taro.land();
		taro.eat();
		taro.sleep();

	}

}
