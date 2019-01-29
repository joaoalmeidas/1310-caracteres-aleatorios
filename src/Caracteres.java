import java.awt.Font;
import java.awt.Graphics;
import java.security.SecureRandom;

import javax.swing.JPanel;

public class Caracteres extends JPanel{
	
	final SecureRandom aleatorio = new SecureRandom();
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		
		
		for(int i = 0; i < aleatorio.nextInt(100000); i++) {
			
			char caractere = (char) aleatorio.nextInt(255);
			g.drawString(Character.toString(caractere), aleatorio.nextInt(getWidth()), aleatorio.nextInt(getHeight()));
			
		}
	}
	
}
