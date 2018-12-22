package tantoPer.RSshooting;

import java.awt.Component;
import java.awt.MouseInfo;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PointerFollower {

	public void follow(JFrame frame, String imagePath) {
		Component follow = new JLabel(new ImageIcon(getClass().getResource(imagePath)));
		Point mouse = MouseInfo.getPointerInfo().getLocation();
		follow.setBounds((int) mouse.getX(), (int) mouse.getY(), 50, 50);
		frame.add(follow);
	}

}
