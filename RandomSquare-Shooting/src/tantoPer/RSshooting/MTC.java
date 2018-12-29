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
		//mousePointerThread = new MousePointerThread(frame, "pointer_cross_aim.png");
		 
	}

	public void update() {
		frame.getButton().setVisible(false);
		frame.squareLoader(new MTC());
		//mousePointerThread.run();
	}

	public void updateSquarePosition() {
		gameManager.update(player, 1);
		frame.updateCounter(String.valueOf(player.getPoints()));
		frame.imageNewPosition();
	}
}
