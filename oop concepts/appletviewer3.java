import java.applet.*;
import java.awt.*;
/*
	<applet code="appletviewer3.class" width="500" height="500">
	<param name="p1" value="20"/>
	</applet>
*/
public class appletviewer3 extends Applet{
	@Override
	public void paint(Graphics g){
		int n = Integer.parseInt(this.getParameter("p1"));
		int x=10, y=10, w=400, h=400;
		for(int i = 0; i<=n; i++){
			g.drawRect(x, y, w, h);
			x+=10;
			y+=10;
			w-=20;
			h-=20;
		}
	}
}