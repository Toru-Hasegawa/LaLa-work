package ex11;

public class Computer extends TangibleAsset {
	String makerName;
	double weight;
	
	public Computer(String name, int price, String color, String makerName ) {
		super(name, price, color);
		this.makerName = makerName;
	}
	public String getMakerName() {
		return makerName;
	}
	public double getWeight() {		
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
		
	}
	
}
