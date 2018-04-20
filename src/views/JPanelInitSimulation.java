package views;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import models.Client;

public class JPanelInitSimulation extends JPanel {

	private static final long serialVersionUID = 1L;
	private int roomNumber;
	private Client client;

	public JPanelInitSimulation(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public void setClient(Client client){
		this.client = client;
	}
	
	@Override
	public void paint(Graphics g) {
		int positionX = 0;
		for (int i = 0; i < roomNumber; i++) {
			g.drawImage(new ImageIcon(getClass().getResource("/img/room.jpg")).getImage(), positionX, 10, (getWidth() / roomNumber), getHeight() / 3, this);
			g.drawImage(new ImageIcon(getClass().getResource("/img/taquilla.jpg")).getImage(), positionX + ((getWidth() / roomNumber) / 2) - 100, getHeight() / 3, 200, 100, this);
			positionX += (getWidth() / roomNumber);
		}
		g.drawImage(new ImageIcon(getClass().getResource("/img/persona.jpg")).getImage(), client.getPosX(), client.getPosY(), 80, 80, this);
	}
}