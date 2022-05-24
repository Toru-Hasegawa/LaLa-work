package ex3;
public class Ex3_6 {
    public static void main (String[] args) {
        System.out.print("数あてゲーム");
        int ans = new java.util.Random() .nextInt(10);
        for(int i = 0; i < 5; i++) {
            System.out.println("0～9までの数字を入力してください。");
            @SuppressWarnings("resource")
			int num = new java.util.Scanner(System.in).nextInt();
            if (ans == num) {
                System.out.println("アタリ!");
                break;
            } else if (ans != num) {
                System.out.println("違います");
            }
        }
    System.out.println("ゲームを終了します");
    }
}