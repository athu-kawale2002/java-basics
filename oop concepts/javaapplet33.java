import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
	<applet code="javaapplet33.class" width="500" height="500">
	</applet>
*/
public class javaapplet33 extends Applet implements ActionListener{
	private Button b;
	private Label l1;
	private Checkbox c1, c2, c3;
	private TextField t1;
	public void init(){
		l1 = new Label("Select Chocklets");
		add(l1);
		
		c1 = new Checkbox("Silk 100 Ru");
		add(c1);
		
		c2 = new Checkbox("Dairy milk 200 ru");
		add(c2);
		
		c3 = new Checkbox("Kit Kat 300 ru");
		add(c3);
		
		b = new Button("Bill");
		add(b);
		b.addActionListener(this);
		
		t1 = new TextField(10);
		add(t1);
		t1.setEditable(false);
	
	}
	public void actionPerformed(ActionEvent e){
		int bill = 0;
		if(c1.getState())
		bill = bill+100;
		if(c2.getState())
		bill = bill + 200;
		if(c3.getState())
		bill = bill+300;
		
		t1.setText(bill+" ");
	}
}