package ex5;

public class Ex5_5 {

	public static void main(String[] args) {
		System.out.println("計算方法を選択してください");
		
		int k = new java.util.Scanner(System.in).nextInt();
		System.out.println("数字を入力してください");
		int x = new java.util.Scanner(System.in).nextInt();
		System.out.println("数字を再度入力してください");
		int y = new java.util.Scanner(System.in).nextInt();
		int answer = (x, y);
		System.out.println("答え:" + answer);
	}
	public static int plus(int x, int y) {
		int answer = x + y;
		return answer;
	}
	public static int minus(int x, int y) {
		int answer = x - y;
		return answer;
	}
	public static int multi(int x, int y) {
		int answer = x * y;
		return answer;
	}
	public static int div(int x, int y) {
		int answer = x / y;
		return answer;
	}

}
