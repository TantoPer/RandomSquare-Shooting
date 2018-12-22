package tantoPer.RSshooting;

import java.awt.Component;
import java.awt.HeadlessException;
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
		while (true) {
			try {
				Component follow = new JLabel(new ImageIcon(getClass().getResource(imagePath)));
				Point mouse = MouseInfo.getPointerInfo().getLocation();
				follow.setBounds((int) mouse.getX(), (int) mouse.getY(), 50, 50);
				frame.getFrame().add(follow);
			} catch (HeadlessException e) {
				break;
			}			
		}
	}

}
