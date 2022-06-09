package chap15;

public class Main557 {

	public static void main(String[] args) {
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";
		if (s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2tとs3は大文字小文字を区別しなければ等しい");
		}
		System.out.println("s1の長さ" + s1.length() + "です");
		if (s1.isEmpty()) {
			System.out.println("s1は空文字です");
		}
	}

}
