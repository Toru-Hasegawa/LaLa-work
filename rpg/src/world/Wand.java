package world;

public class Wand {
	private String name;
	private double power;
	
	public Wand(String name) {
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("杖の名前が不適切です。");
		}
		this.name = name;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		if (power < 0.5 || power < 100.0) {
			throw new IllegalArgumentException("杖の魔力が異常値です。");
		}
		this.power = power;
	}
}
