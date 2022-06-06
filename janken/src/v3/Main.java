package v3;

public class Main {

	public static void main(String[] args) {
		Com com1 = new Com(new RandomNextHand());
		com1.setName("コム1");
		
		User user = new User(new InputNextHand());
		user.setName("サスケ");
		
		com1.setHand();
		user.setHand();
		Game game = new Game();
		game.Judge(com1, user);
		game.dispResult(com1, user);
		

	}

}
