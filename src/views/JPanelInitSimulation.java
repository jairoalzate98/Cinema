package views;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import models.Client;
import models.Room;

public class JPanelInitSimulation extends JPanel {

	private static final long serialVersionUID = 1L;
	private int roomNumber;
	private Client client;
	private ArrayList<Room> rooms;

	public JPanelInitSimulation(int roomNumber) {
		this.roomNumber = roomNumber;
		rooms = new ArrayList<>();
	}
	
	public void setClient(Client client){
		this.client = client;
	}
	
	public ArrayList<Room> getRooms(){
		return rooms;
	}
	
	@Override
	public void paint(Graphics g) {
		rooms.clear();
		int positionX = 0;
		for (int i = 0; i < roomNumber; i++) {
			Room r = new Room(positionX + ((getWidth() / roomNumber) / 2) - 100, getHeight() / 3);
			rooms.add(r);
			g.drawImage(new ImageIcon(getClass().getResource("/img/room.jpg")).getImage(), positionX, 10, (getWidth() / roomNumber), getHeight() / 3, this);
			g.drawImage(new ImageIcon(getClass().getResource("/img/taquilla.jpg")).getImage(), r.getPosX(), r.getPosY(), 200, 100, this);
			positionX += (getWidth() / roomNumber);;
		}
		removeAll();
		g.drawImage(new ImageIcon(getClass().getResource("/img/persona.jpg")).getImage(), client.getPosX(), client.getPosY(), 80, 80, this);
	}
}