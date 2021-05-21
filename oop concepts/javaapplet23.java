import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
	<applet code="javaapplet23.class" width="500" height="500">

	</applet>
	
*/
public class javaapplet23 extends Applet implements ItemListener{
	private Label l1, l2;
	private Checkbox c1, c2, c3;
	private TextField t1;
	public void init()
	{
		l1 = new Label("Select chocolate");
		add(l1);
		
		c1 = new Checkbox("Silk 100ru");
		add(c1);
		c1.addItemListener(this);
		
		c2 = new Checkbox("Dairy Milk 200ru");
		add(c2);
		c2.addItemListener(this);
		
		c3 = new Checkbox("Kkit kat 300ru");
		add(c3);
		c3.addItemListener(this);
		
		l2 = new Label("Bill");
		add(l2);
		
		t1 = new TextField(10);
		add(t1);
		t1.setEditable(false);
	}
	public void itemStateChanged(ItemEvent e){
		int bill = 0;
		if(c1.getState())
		bill = bill + 100;
		
		if(c2.getState())
		bill = bill + 200;
		
		if(c3.getState())
		bill = bill + 300;
		
		t1.setText(bill+" ");
	}
}