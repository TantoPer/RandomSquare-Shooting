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
		frame.squareLoader(new MTC());	
		frame.getButton().setVisible(false);
	}

	public void updateSquarePosition() {
		gameManager.update(player, 1);
		frame.updateCounter(String.valueOf(player.getPoints()));
		frame.imageNewPosition();		
	}
}
