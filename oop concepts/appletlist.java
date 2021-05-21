import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
	<applet code="appletlist.class" width="500" height="500">
	</applet>
*/
class appletlist extends Applet implements ActionListener{
	private List l1;
	private Button b;
	public void init(){
		l1 = new List(5, true);
		add(l1);
		String arr[] = {"Shankar", "chacha", "rani", "rajat". "panipat", "gurupal", "shantabai"};
		for(int i = 0; i<arr.length; i++){
			l1.add(arr[i]);
		}
		
		b = new Button(Submit);
		b.add(b);
	}
	public void actionPerformed(ActionEvent e){
		
	}
}