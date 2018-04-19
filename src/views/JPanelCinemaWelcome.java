package views;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JPanelCinemaWelcome extends JPanel{

	private static final long serialVersionUID = 1L;

	@Override
	public void paint(Graphics g) {
		g.drawImage(new ImageIcon(getClass().getResource("/img/welcome.jpg")).getImage(), 0, 0, getWidth(), getHeight(), this);
	}
}