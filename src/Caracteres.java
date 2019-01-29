import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;

import javax.swing.JPanel;

public class Caracteres extends JPanel{
	
	final SecureRandom aleatorio = new SecureRandom();
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		
		
		for(int i = 0; i < aleatorio.nextInt(100000); i++) {
			
			g.setColor(new Color(aleatorio.nextInt(256), aleatorio.nextInt(256), aleatorio.nextInt(256)));
			
			char caractere = (char) aleatorio.nextInt(255);
			g.drawString(Character.toString(caractere), aleatorio.nextInt(getWidth()), aleatorio.nextInt(getHeight()));
			
		}
	}
	
}
