import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public abstract class MyShapes extends JPanel{
	private int x;
	private int y;
	private int length;
	private int width;
	private Color color;
	
	public MyShapes(){
		this(0,0,0,0,new Color(0,0,0));
	}
	
	public MyShapes(int x, int y, int length, int width, Color color){
		this.x = x;
		this.y = y;
		this.length = length;
		this.width = width;
		this.color = color;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public int getX(){
		return x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public int getY(){
		return y;
	}
	
	public void setLength1(int length){
		this.length = length;
	}
	
	public int getLength1(){
		return length;
	}
	
	public void setWidth1(int width){
		this.width = width;
	}
	
	public int getWidth1(){
		return width;
	}
	
	public void setColor(int x, int y, int z){
		if((x < 0 || x >= 256)||(y < 0 || y >= 256)||(z < 0 || z >= 256)){
			throw new IllegalArgumentException("That color does not exist.");
		}
		this.color = new Color(x,y,z);
	}
	
	public Color getColor(){
		return color;
	}
	
	public void paintComponent(Graphics g){};
	
}