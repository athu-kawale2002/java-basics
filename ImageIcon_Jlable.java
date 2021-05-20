import javax.swing.*;
import java.awt.*;
class MyFrame extends JFrame{
	private JLabel lbl;
	private JScrollPane sp;
	public MyFrame(){
		ImageIcon img = new ImageIcon("C:/Users/MSI/OneDrive/Pictures/Saved Pictures/1.jpg");
		lbl = new JLabel(img);
		sp = new JScrollPane(lbl);
		this.add(sp, BorderLayout.CENTER);
		
		this.setVisible(true);
		this.setSize(300, 300);
	}
}

class ImageIcon_Jlable{
	public static void main(String ...args){
		MyFrame f = new MyFrame();
	}
}