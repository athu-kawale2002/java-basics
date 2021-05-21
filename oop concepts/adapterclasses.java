import java.awt.*;
import java.awt.event.*;
class Mywindow extends WindowAdapter{
	public void windowClosing(WindowEvent e){
	Window w = e.getWindow();
	w.dispose();
	}
}
class MyFrame extends Frame{
	public MyFrame(){
	super("Compilers");
		Mywindow wa = new Mywindow();
		this.addWindowListener(wa);
		this.setSize(500, 500);
		this.setVisible(true);
	}
}
class adapterclasses{
	public static void main(String ...args){
		MyFrame f = new MyFrame();
	}
}