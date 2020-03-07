import java.security.SecureRandom;
import java.awt.Color;
import java.awt.Graphics;

public class MyRandomShapes extends MyShapes{
	public MyRandomShapes(int x, int y, int length, int width, Color color){
		super(x,y,length,width,color);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		SecureRandom shape = new SecureRandom();
		SecureRandom mesr = new SecureRandom();
		//int[] MyShape = 
		for(int i = 0; i < 5; i++){
			int shapeNo = 1 + shape.nextInt(3);
			
			if(shapeNo == 1){
				g.setColor(new Color(mesr.nextInt(256),mesr.nextInt(256),mesr.nextInt(256)));
				g.drawLine(getX(), getY(), getLength1(), getWidth1());
			} else if(shapeNo == 2){
				g.setColor(new Color(mesr.nextInt(256),mesr.nextInt(256),mesr.nextInt(256)));
				g.fillRect(getX(), getY(), getLength1(), getWidth1());
			} else {
				g.setColor(new Color(mesr.nextInt(256),mesr.nextInt(256),mesr.nextInt(256)));
				g.fillOval(getX(), getY(), getLength1(), getWidth1());
			}
		}
		
	}
}