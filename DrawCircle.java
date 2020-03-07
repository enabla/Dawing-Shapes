import java.security.SecureRandom;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawCircle extends JPanel{
	int r;
	int g;
	int b;
	
	
	int x;
	int y;
	int z;

	public void Color(int r, int g, int b){
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
		
	public void paintComponent(Graphics g2){
		super.paintComponent(g2);
		
		SecureRandom colour1 = new SecureRandom();
		r = 1 + colour1.nextInt(255);
		x = 1 + colour1.nextInt(255);
		this.r = r;
		
		SecureRandom colour2 = new SecureRandom();
		g = 1 + colour2.nextInt(255);
		y = 1 + colour2.nextInt(255);
		this.g = g;
		
		SecureRandom colour3 = new SecureRandom();
		b = 1 + colour3.nextInt(255);
		z = 1 + colour3.nextInt(255);
		this.b = b;
		
		Color myColor = new Color(r,g,b);
		Color otherColor = new Color(x,y,z);
		
		
		int i = 0;
		int counter = 1;
		
		
		while(counter <= 5){
			if(counter % 2 == 1){
				g2.setColor(myColor);
				}
			
			if(counter % 2 == 0){
				g2.setColor(otherColor);
			}
			
			g2.fillOval(10+i,10+i,200-2*i,200-2*i);
			i+= 20;
			counter++;
		}
	}
}