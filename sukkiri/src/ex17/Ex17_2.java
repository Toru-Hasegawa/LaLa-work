package ex17;

public class Ex17_2 {

	public static void main(String[] args) {
		
		try {
		String s = null;
		// System.out.println(s.length);
		} catch(NullPointerException e) {
			System.out.println("nullPointerException例外をcatchしました");
			System.out.println("---スタックトレース---");
			e.printStackTrace();
			System.out.println("---スタックトレース---");
		}

	}

}
