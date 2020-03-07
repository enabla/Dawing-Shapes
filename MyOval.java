import java.awt.Color;
public class MyOval extends MyShapes{
	public MyOval(int x, int y, int length, int width, Color color){
		super(x, y, length, width, color);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawOval(int x, int y, int length, int width);
	}
}