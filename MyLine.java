import java.awt.Graphics;
import java.awt.Color;
import java.security.SecureRandom;

public class MyLine extends MyShapes{
	
	public MyLine(int x, int y, int length, int width, Color color)){
		super(x,y,length,width,color);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		SecureRandom randomNumber = new SecureRandom();
		
		int r = randomNumber.nextInt(256);
		int g = randomNumber.nextInt(256);
		int b = randomNumber.nextInt(256);
		
		setColor(Color(r,g,b));
		g.drawLine(getX(),getY(),getLength1(),getWidth1());
	}
}