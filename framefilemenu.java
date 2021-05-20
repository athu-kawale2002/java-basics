import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ActionListener{
	private MenuBar Mb;
	private Menu a, b;
	private MenuItem mi;
	public MyFrame(){
		//this.addActionListener();
		super("compilers");
		
		Mb = new MenuBar();
		this.setMenuBar(Mb);
		
		a = new Menu("File");
		Mb.add(a);
		
		b = new Menu("Edit");
		Mb.add(b);
		
		String arr[] = {"New", "Open", "Save", "Exit"};
		for(int i = 0; i<arr.length; i++){
			mi = new MenuItem(arr[i]);
			a.add(mi);
			mi.addActionListener(this);
		}
		this.setSize(500, 500);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		String caption = e.getActionCommand();
		if(caption == "Exit")
		this.dispose();
	}
}
class framefilemenu{
	public static void main(String ...args){
		MyFrame f = new MyFrame();
	}
}