import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
	<applet code="mouseeventapplet.class" width="500" height="500">
	</applet>
*/
class mouseeventapplet extends Applet implements MouseListener, MouseMotionListener{
	private Label l1;
	private Graphics g;
	private int x, y;
	public void init(){
		l1 = new Label();
		add(l1);
		
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		
		g = this.getGraphics();
	}
	public void mouseEntered(MouseEvent e){
		l1.setText("Mouse Entered ");
	}
	public void mouseExited(MouseEvent e){
		l1.setText("Mouse Exited");
	}
	
	public void mousePressed(MouseEvent e){
		g.drawString("Down", e.getX(), e.getY());
	}
	public void mouseClicked(MouseEvent e){
		g.drawString("MouseClicked", gettX(), e.getY());
	}
	public void mouseMoved(MouseEvent e){
		this.showStatus(e.getX()+","+getY());
	}
	public void mouseDragged(MouseEvent e){
		g.drewLine(x, y, e.getX(), e.getY());
		x = e.getX();
		y = e.getY();
	}
}