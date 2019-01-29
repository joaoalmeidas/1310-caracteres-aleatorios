import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.security.SecureRandom;

import javax.swing.JPanel;

public class Caracteres extends JPanel{
	
	final SecureRandom aleatorio = new SecureRandom();
	final String[] nomeFontes = {};
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
		Font[] fonts = e.getAllFonts();
		
		for(int i = 0; i < aleatorio.nextInt(100000); i++) {
			
			g.setColor(new Color(aleatorio.nextInt(256), aleatorio.nextInt(256), aleatorio.nextInt(256)));
			g.setFont(new Font(fonts[aleatorio.nextInt(fonts.length)].getName(), Font.PLAIN, 12 + aleatorio.nextInt(50)));
			
			
			char caractere = (char) aleatorio.nextInt(255);
			g.drawString(Character.toString(caractere), aleatorio.nextInt(getWidth()), aleatorio.nextInt(getHeight()));
			
		}
	}
	
}
