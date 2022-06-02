package ex11;

public class Book extends TangibleAsset {
	String isbn;
	double weight;
	
	public Book(String name, int price, String color, String isbn) {
		super(name, price, color);
		this.isbn = isbn;
	}
	public String getIsbn() {
		return isbn;
	}
	public double getWeight() {
		
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
		
	}
	
}
