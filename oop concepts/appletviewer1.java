import java.applet.*;
import java.awt.*;
/*
	<applet code="appletviewer1.class" width="300" height="300">
	</applet>
*/
public class appletviewer1 extends Applet{
	public void init(){
		System.out.println("init");
	}
	public void start(){
		System.out.println("Start");
	}
	public void paint(Graphics g){
		System.out.println("paint");
	}
	public void stop(){
		System.out.println("stop");
	}
	public void Destroy(){
		System.out.println("Destroy");
	}
}