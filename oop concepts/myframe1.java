import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ActionListener{
	private Button b;
	public MyFrame(String title){
		super(title);
		b = new Button ("close");
		this.add(b, BorderLayout.SOUTH);
		b.addActionListener(this);
	}
	
	public  void actionPerformed(ActionEvent e){
		this.dispose();
	}
}
class myframe1{
	public static void main(String ...args){
		MyFrame f = new MyFrame("Deadpool frame");
		f.setVisible(true);
		f.setSize(500, 500);
	}
}