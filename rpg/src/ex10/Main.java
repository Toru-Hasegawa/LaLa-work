package ex10;

import world.Hero;
import world.PoisonMatango;
import world.SuperHero;

public class Main {

	public static void main(String[] args) {
		PoisonMatango pm = new PoisonMatango();
		Hero h = new Hero("ミナト");
		SuperHero sh = new SuperHero("アサカ");
		pm.attack(h);
		pm.attack(sh);
		h.attack(pm);
		sh.attack(pm);
	}

}
