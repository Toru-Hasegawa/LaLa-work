package chap11;

import world.Hero;
import world.SuperHero;

public class Main433 {

	public static void main(String[] args) {
		/*
		Goblin goblin = new Goblin();
		
		goblin.attack();
		goblin.run();
		System.out.println("HP:" + goblin.hp);
		System.out.println("MP:" + goblin.mp);
		
		Werewolf w = new Werewolf();
		w.attack();
		w.run();
		System.out.println("HP:" + w.hp);
		System.out.println("MP:" + w.mp);
		
		DeathBat d = new DeathBat();
		d.attack();
		d.run();
		System.out.println("HP:" + d.hp);
		System.out.println("MP:" + d.mp);
		*/
		
		Hero h = new Hero("田中");
		h.sleep();
		
		SuperHero sh = new SuperHero("まえだ");
		sh.sleep();

	}

}
