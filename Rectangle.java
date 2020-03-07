import java.awt.Graphics;

public class Rectangle extends MyShapes(){
	public Rectangle(int x, int y, int length, int width){
		super(x,y,length,width);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawRect(getX(), getY(), getLength1(), getWidth1());
	}
}