import java.util.*;
import java.awt.*;
import javax.swing.*;
class MyFrame extends JFrame{
	private JLabel lbl;
	
	public MyFrame(){
		lbl = new JLabel("Atharva", JLabel.CENTER);
		this.add(lbl, BorderLayout.CENTER);
		lbl.setOpaque(true);
		lbl.setBackground(Color.YELLOW);
		
		this.setVisible(true);
		this.setSize(500, 500);
	}
}

class frame_Jlabel2{
	public static void main(String ...args){
		MyFrame f = new MyFrame();
	}
}