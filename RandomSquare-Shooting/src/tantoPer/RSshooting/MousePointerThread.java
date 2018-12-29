package tantoPer.RSshooting;

import java.awt.Component;
import java.awt.MouseInfo;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MousePointerThread implements Runnable {

	private Frame frame;
	private String imagePath;

//	public MousePointerThread(Frame frame, String imagePath) {
//		this.frame = frame;
//		this.imagePath = imagePath;
//	}

	public MousePointerThread(Frame frame2, String imagePath2) {
		this.frame = frame2;
		this.imagePath = imagePath2;
	}

	@Override
	public void run() {
		Point mouse = MouseInfo.getPointerInfo().getLocation();
		Component follow = new JLabel(new ImageIcon(getClass().getResource(imagePath)));
		while (true) {
			try {
				System.out.println("sono dentro try");
				Thread.sleep(50);
				follow.setVisible(false);
				mouse = MouseInfo.getPointerInfo().getLocation();
				follow.setBounds((int) mouse.getX() - 28, (int) mouse.getY() - 41, 50, 50);
				System.out.println("sono dentro try, sto per renderlo visibile");
				frame.getFrame().add(follow).setVisible(true);
				Thread.sleep(50);
			} catch (InterruptedException e) {
				System.out.println("errore dentro il thread");
				break;
			}
		}
	}

}
