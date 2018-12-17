package tantoPer.RSshooting;

public class Player {

	private int points;
	
	public Player() {
		points = 0;
	}

	public void addPoints(int points) {
		this.points += points;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

}
