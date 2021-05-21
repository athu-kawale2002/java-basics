import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
	<applet code="multiplebuttons.class" width="500" height="500">
	</applet>
*/
public class multiplebuttons extends Applet implements ActionListener{
		private Label l1, l2, l3;
		private TextField t1, t2, t3;
		private Button b;
		public void init()
		{
			l1 = new Label("First Value");
			add(l1);
			
			t1 = new TextField(10);
			add(t1);
			
			l2 = new Label("Second value");
			add(l2);
			
			t2 = new TextField(10);
			add(t2);
			
			String arr[] = {"ADD", "SUB", "MULT", "DIV"};
			for(int i = 0; i<arr.length; i++){
				b = new Button(arr[i]);
				add(b);
				b.addActionListener(this);
			}
			
			l3 = new Label("Result");
			add(l3);
			
			t3 = new TextField(10);
			add(t3);
			t3.setEditable(false);
		}
		public void actionPerformed(ActionEvent e){
			int x = Integer.parseInt(t1.getText());
			int y = Integer.parseInt(t2.getText());
			double z = 0;
			
			String caption = e.getActionCommand();
			if(caption.equals("ADD"))
				z = x+y;
			else if(caption.equals("SUB"))
					z = x-y;
			else if(caption.equals("MULT"))
						z = x*y;
			else if(caption.equals("DIV"))
						z = x/(double)y;
			
			t3.setText(z +" ");
		}
}