import java.applet.*;
import java.awt.*;
import java.util.*;
/*
	<applet code="appletviewer.class" width="300" height="300">
	</applet>
*/
public class appletviewer extends Applet{
	@Override
	public void paint(Graphics g)
	{
		Date d = Calendar.getInstance().getTime();
		g.drawString(d.toString(), 10, 20);
		try{
			Thread.sleep(1000);
			repaint();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}