package tantoPer.RSshooting;

public class MTC {

	private static Frame frame;
	private static GameManager gameManager;
	private static Player player;

	public static void main(String[] args) {
		gameManager = new GameManager();
		player = new Player();
		frame = new Frame(new MTC());
	}

	public void update() {
		gameManager.update(player, 1);
		frame.updateCounter(String.valueOf(player.getPoints()));
		frame.imagineNewPosition();
	}
}
