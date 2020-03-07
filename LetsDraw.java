import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.security.SecureRandom;

public class LetsDraw{
	public static void main(String[] args){
		SecureRandom myColor = new SecureRandom();
		SecureRandom size = new SecureRandom();
		
		MyShapes shapes = new MyRandomShapes(size.nextInt(300),size.nextInt(300),size.nextInt(300),size.nextInt(300), new Color(myColor.nextInt(256),myColor.nextInt(256),myColor.nextInt(256)));
		//MyShapes rectangle = new MyRectangle(150,150,100,100);
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(shapes);
		//application.add(rectangle);
		application.setSize(700,700);
		application.setVisible(true);
		
	}
}