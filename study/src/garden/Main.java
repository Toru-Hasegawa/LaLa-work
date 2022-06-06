package garden;

import garden.Flower.Leaf;

public class Main {

	public static void main(String[] args) {
		Flower f = new Flower();
		f.bloom();
		Leaf l = f.makeLeaf();
		
		Rose r = new Rose("バラ");
		r.smell();
		r.bloom();
		
		System.out.println(l.getName());

	}

}
