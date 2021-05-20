import java.awt.*;
import javax.swing.*;
class MyFrame extends JFrame{
	private JLabel lbl;
	
	public MyFrame(){
		lbl = new JLabel("Atharva in Compilers", JLabel.CENTER);
		this.add(lbl, BorderLayout.CENTER);
		
		this.setVisible(true);
		this.setSize(500, 500);
	}
}
class jframe_jlabel{
	public static void main(String ...args){
		MyFrame f = new MyFrame();
	}
}