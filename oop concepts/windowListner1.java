import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements WindowListener{
	public MyFrame(){
		super("Compilers");
		this.addWindowListener(this);
		this.setSize(500, 500);
		this.setVisible(true);
	}
	public void windowClosing(WindowEvent e){
		this.dispose();
	}
	public void windowClosed(WindowEvent e){}
	public void windowActivated(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
}
class windowListner1{
	public static void main(String ...args){
		MyFrame f = new MyFrame();
	}
}
