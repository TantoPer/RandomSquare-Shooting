package tantoPer.RSshooting;

public class MTC {

	private static Frame frame;
	private static GameManager gameManager;
	private static Player player;
	private static MousePointerThread mousePointerThread;

	public static void main(String[] args) {
		gameManager = new GameManager();
		player = new Player();
		frame = new Frame(new MTC());
		mousePointerThread = new MousePointerThread(frame, "circle.png");
		mousePointerThread.run();
	}

	public void update() {
		gameManager.update(player, 1);
		frame.updateCounter(String.valueOf(player.getPoints()));
		frame.imagineNewPosition();
	}
}
