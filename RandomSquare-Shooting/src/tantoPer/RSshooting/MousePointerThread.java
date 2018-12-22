package tantoPer.RSshooting;

import java.awt.Component;
import java.awt.MouseInfo;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MousePointerThread implements Runnable {

	private Frame frame;
	private String imagePath;

	public MousePointerThread(Frame frame, String imagePath) {
		this.frame = frame;
		this.imagePath = imagePath;
	}

	@Override
	public void run() {
		Point mouse = MouseInfo.getPointerInfo().getLocation();
		Component follow = new JLabel(new ImageIcon(getClass().getResource(imagePath)));
		while (true) {
			try {
				Thread.sleep(50);
				follow.setVisible(false);
				mouse = MouseInfo.getPointerInfo().getLocation();
				follow.setBounds((int) mouse.getX() - 30, (int) mouse.getY() - 30, 50, 50);
				frame.getFrame().add(follow).setVisible(true);
				Thread.sleep(50);
			} catch (InterruptedException e) {
				break;
			}
		}
	}

}
