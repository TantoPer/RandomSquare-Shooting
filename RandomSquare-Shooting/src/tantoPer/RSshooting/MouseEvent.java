package tantoPer.RSshooting;

import java.awt.event.MouseListener;

public class MouseEvent implements MouseListener {

	private MTC mtc;

	public MouseEvent(MTC mtc) {
		this.mtc = mtc;
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
	//	mtc.update();
		mtc.update2();
		
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
	}
}
