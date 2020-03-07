//import java.awt.Graphics;
import java.awt.Color;

public class MyRectangle extends MyShapes{
	public MyRectangle(int x, int y, int length, int width, Color color){
		super(x,y,length,width, color);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawRect(getX(), getY(), getLength1(), getWidth1());
	}
}