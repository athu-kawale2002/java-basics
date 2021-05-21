import javax.swing.*;
import java.awt.*;
class MyFrame extends JFrame{
	private JLabel lbl , lbl1;
	private JScrollPane sp, sp1;
	private JSplitPane c1, c2;
	public MyFrame(){
		ImageIcon img = new ImageIcon("C:/Users/MSI/OneDrive/Pictures/Saved Pictures/1.jpg");
		lbl = new JLabel(img);
		sp = new JScrollPane(lbl);
		
		ImageIcon img1 = new ImageIcon("C:/Users/MSI/OneDrive/Pictures/Saved Pictures/2.jpg");
		lbl1 = new JLabel(img1);
		sp1 = new JScrollPane(lbl1);
		
		c1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, sp, sp1);
		this.add(c1, BorderLayout.CENTER);
		c1.setDividerLocation(250);
		c1.setDividerSize(1);
		
		this.setVisible(true);
		this.setSize(500, 500);
	}
}
class JsplitPane_JLabel{
	public static void main(String ...args){
		MyFrame f = new MyFrame();
	}
}