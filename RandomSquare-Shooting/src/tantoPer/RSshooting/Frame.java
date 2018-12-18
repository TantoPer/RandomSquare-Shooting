package tantoPer.RSshooting;

import java.awt.Container;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame {

	private JLabel counter;
	private JLabel imgToView;
	private JFrame frame;
	private Square squares[];
	private int position = 0;

	Random rand = new Random();

	public Frame(MTC mtc) {
		frame = new JFrame("Start");
		squares = new Square[2];

		for (int i = 0; i < squares.length; i++) {
			squares[i] = squareFactory(randomPosition(i), randomPosition(i), 50, 50, "circle.png");
			
			Icon image = new ImageIcon(getClass().getResource(squares[i].getFileName()));
			imgToView = new JLabel(image);
			imgToView.setBounds(squares[i].getxPosition(), squares[i].getSizeY(), 50, 50);
			frame.add(imgToView).setVisible(true);
		}

		frame.setSize(500, 400);
		Container myContainer = frame.getContentPane();
		myContainer.setLayout(null);
		createButton(frame, mtc);
		createPointString();
		createLabelCounter();
		imagineLoader("circle.png");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	private int randomPosition(int i) {
		return 150 + 100 * i;
	}

	private Square squareFactory(int xPosition, int yPosition, int sizeX, int sizeY, String fileName) {
		return new Square(xPosition, yPosition, sizeX, sizeY, fileName);
	}

	private void imagineLoader(String fileName) {
		Icon image = new ImageIcon(getClass().getResource(fileName));
		imgToView = new JLabel(image);
		imgToView.setBounds(150, 150, 50, 50);
		frame.add(imgToView).setVisible(true);

	}

	public void imagineNewPosition() {
		int randomX, randomY;
		randomX = rand.nextInt(500);
		randomY = rand.nextInt(400);
		if (getPosition() == 0) {
			imgToView.setVisible(false);
			imgToView.setBounds(randomX, randomY, 50, 50);
			frame.add(imgToView).setVisible(true);
			setPosition(1);
		} else {
			imgToView.setVisible(false);
			imgToView.setBounds(randomX, randomY, 50, 50);
			frame.add(imgToView).setVisible(true);
			setPosition(0);
		}
	}

	private void createPointString() {
		JLabel pointString = new JLabel();
		pointString.setText("Points:");
		pointString.setBounds(100, 300, 100, 50);
		frame.add(pointString);

	}

	private void createButton(JFrame frame, MTC mtc) {
		JButton button = new JButton("click me!");
		button.setBounds(200, 20, 100, 50);
		button.addMouseListener(new MouseEvent(mtc));
		frame.add(button);
	}

	private void createLabelCounter() {
		counter = new JLabel();
		counter.setText("0");
		counter.setBounds(200, 300, 100, 50);
		frame.add(counter);
	}

	public void updateCounter(String text) {
		this.counter.setText(text);
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

}
