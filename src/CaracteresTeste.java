import java.awt.Color;

import javax.swing.JFrame;

public class CaracteresTeste {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("caracteres");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Caracteres carac = new Caracteres();
		frame.add(carac);
		frame.setBackground(Color.WHITE);
		frame.setSize(315, 330);
		frame.setVisible(true);

	}

}
