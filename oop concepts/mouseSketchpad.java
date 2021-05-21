import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
	<applet code="mouseeventapplet.class" width="500" height="500">
	</applet>
*/
public class mouseeventapplet extends Applet implements MouseListener, MouseMotionListener{
	private Label lbl;
	private Graphics g;
	private int x, y;
	public void init(){
		lbl = new Label();
		add(lbl);
		g = this.getGraphics();
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
	public void mouseEntered(MouseEvent e){
		lbl.setText("Mouse Entered");
	}
	public void mouseExited(MouseEvent e){
		lbl.setText("Mouse Exited");
	}
	public void mouseClicked(MouseEvent e){
		g.drawString("*", e.getX(), e.getY());
	}
	public void mousePressed(MouseEvent e){
		g.drawString(e.getX(), e.getY());
		x = e.getX();
		y = e.getY();
	}
	public void mouseReleased(MouseEvent e){
		g.drawString(e.getX(), e.getY());
	}
	public void mouseMoved(MouseEvent e){
		this.showStatus(e.getX()+","+e.getY()+"px");
	}
	public void mouseDragged(MouseEvent e){
		g.drawLine(x, y, e.getX(), e.getY());
		x = e.getX();
		y = e.getY();
		
	}
}