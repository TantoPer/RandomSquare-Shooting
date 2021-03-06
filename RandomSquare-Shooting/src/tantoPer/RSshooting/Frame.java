package tantoPer.RSshooting;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
	private JButton button;
	Random rand = new Random();

	public Frame(MTC mtc) {
		frame = new JFrame("Random Square Shooting : THE GAME!");
		squares = new Square[5];
		frame.setSize(500, 400);
		frame.addMouseListener(new FrameEvents(this));
		Container myContainer = frame.getContentPane();
		myContainer.setLayout(null);
		createButton(getFrame(), mtc);
		createPointString();
		createLabelCounter();
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public void squareLoader(MTC mtc) {
		for (int index = 0; index < squares.length; index++) {
			squares[index] = squareFactory(randomPosition(100), randomPosition(30), 30, 30, "circle.png");
			Icon image = new ImageIcon(getClass().getResource(squares[index].getFileName()));
			imgToView = new JLabel(image);
			frame.add(imgToView).setVisible(false);
			imgToView.setBounds(squares[index].getxPosition(), squares[index].getyPosition(), squares[index].getSizeX(),
					squares[index].getSizeY());
			imgToView.addMouseListener(new SquareEvent(mtc));
			frame.add(imgToView).setVisible(true);
		}
	}

	private int randomPosition(int i) {
		return i + rand.nextInt(200);
	}

	private void createButton(JFrame frame, MTC mtc) {
		button = new JButton("Start!");
		button.setBounds(200, 20, 100, 50);
		button.addMouseListener(new ButtonEvent(mtc));
		frame.add(button);
	}

	private Square squareFactory(int xPosition, int yPosition, int xSize, int ySize, String fileName) {
		return new Square(xPosition, yPosition, xSize, ySize, fileName);
	}

	public void imageNewPosition() {
		imgToView.setVisible(false);
		imgToView.setBounds(rand.nextInt(300), rand.nextInt(250), 30, 30);
		frame.add(imgToView).setVisible(true);
	}

	private void createPointString() {
		JLabel pointString = new JLabel();
		pointString.setText("Points:");
		pointString.setBounds(100, 300, 100, 50);
		frame.add(pointString);
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

	public JButton getButton() {
		return button;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public JFrame getFrame() {
		return frame;
	}

}
