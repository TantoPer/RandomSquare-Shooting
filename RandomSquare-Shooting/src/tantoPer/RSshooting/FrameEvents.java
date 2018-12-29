package tantoPer.RSshooting;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class FrameEvents implements MouseListener {
	private Frame frame;
	private static MousePointerThread mousePointerThread;


	public FrameEvents(Frame frame2) {
		System.out.println("Sono dentro frame event");
		this.frame = frame2;
		this.mousePointerThread = new MousePointerThread(frame2, "pointer_cross_aim.png");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("ho appena lanciato un thread");
		 mousePointerThread.run();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		try {
			mousePointerThread.wait();
		} catch (InterruptedException e1) {
			System.out.println(" errore di uscita: diomerda");
			e1.printStackTrace();
		}
	}

}
