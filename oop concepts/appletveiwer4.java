import java.applet.*;
import java.awt.*;
/*
	<applet code="appletveiwer4.class" width="500" height="500">
	</applet>
*/
public class appletveiwer4 extends Applet{
public void paint(Graphics g){
	int x[] = {10, 210, 110};
	int y[] = {110, 110, 240};
	g.setColor(Color.RED);
	g.fillPolygon(x, y, 3);
	g.fillArc(10, 0, 200, 200, 180, 90);
	g.fillArc(10, 0, 200, 200, 270, 90);
	g.fillArc(10, 60, 100, 100, 0, 180);
	g.fillArc(110, 60, 100, 100, 0, 180);
	g.setColor(Color.CYAN);
	g.setFont(new Font("Gabriola", Font.BOLD+Font.ITALIC, 30));
	g.drawString("Atharva",55, 150);
}}