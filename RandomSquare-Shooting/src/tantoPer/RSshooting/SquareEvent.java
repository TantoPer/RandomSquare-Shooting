package tantoPer.RSshooting;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SquareEvent implements MouseListener {
	private MTC mtc;

	public SquareEvent( MTC mtc) {
		this.mtc=mtc;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
	mtc.updateSquarePosition();
	}
	@Override
	public void mousePressed(MouseEvent e) {
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}

}
