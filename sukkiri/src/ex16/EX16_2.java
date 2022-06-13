package ex16;

import java.util.ArrayList;
import java.util.List;

public class EX16_2 {

	public static void main(String[] args) {
		
		
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		
		List<Hero> heroList = new ArrayList<>();
		heroList.add(h1);
		heroList.add(h2);
		for (Hero hero : heroList) {
			System.out.println(hero.getName());
		}
	}

}
