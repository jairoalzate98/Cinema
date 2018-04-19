package views;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JPanelInitSimulation extends JPanel {

	private static final long serialVersionUID = 1L;
	private int roomNumber;

	public JPanelInitSimulation(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	@Override
	public void paint(Graphics g) {
		int positionX = 0;
		for (int i = 0; i < roomNumber; i++) {
			g.drawImage(new ImageIcon(getClass().getResource("/img/room.jpg")).getImage(), positionX, 10, (getWidth() / roomNumber), getHeight() / 3, this);
			g.drawImage(new ImageIcon(getClass().getResource("/img/taquilla.jpg")).getImage(), positionX + ((getWidth() / roomNumber) / 2) - 100, getHeight() / 3, 200, 100, this);
			positionX += (getWidth() / roomNumber);
		}
	}
}