import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
	<applet code="choiceapplet.class" width="500" height="500">
	</applet>
*/
public class choiceapplet extends Applet implements ItemListener
{
	private Label l1;
	private Choice c;
	private Button b;
	public void init(){
		l1 = new Label("Select Colour");
		add(l1);
		
		c = new Choice();
		add(c);
		c.addItemListener(this);
		
		String arr[] = {"Blue", "Green", "RED"};
		for(int i = 0; i<arr.length; i++)
		c.add(arr[i]);
		
	}
	public void itemStateChanged(ItemEvent e){
		String clr = c.getSelectedItem();
		Graphics g = this.getGraphics();
		
		if(clr.equals("RED"))
		g.setColor(Color.RED);
		if(clr.equals("Green"))
		g.setColor(Color.GREEN);
		if(clr.equals("Blue"))
		g.setColor(Color.BLUE);
		
		g.fillRect(50, 50, 200, 200);
	}
}