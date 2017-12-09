import java.applet.Applet;
import java.awt.Graphics;

public class applet  extends Applet
{
StringBuffer buffer;
static int n=0;
public void init() {
	setSize(600,300);
	buffer=new StringBuffer();
	addItem("init");
}

public void start() {
	addItem("start");
}
public void stop() {
	addItem("stop");
}

public void destroy() {
	addItem("destroy");
}


















private void addItem(String newWord) {
	System.out.println(newWord);
	buffer.append(newWord);
	repaint();
}
public void paint(Graphics g) {
	g.drawRect(0, 0, getWidth()-1, getHeight()-1);
	n++;
	g.drawString(buffer.toString()+"paint被调用次数"+n,5,15);
	System.out.println("paint被调用次数:"+n);
}
}
