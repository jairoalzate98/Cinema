package models;

public class Room extends Node {

	private int idRoom;
	private static int count;
	private int capacity;
	private Room nextRoom;
	private int posX;
	private int posY;
	
	public Room(int posX, int posY) {
		this.idRoom = ++count;
		capacity = (int) (Math.random()*30);
		this.posX = posX;
		this.posY = posY;
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public int getIdRoom() {
		return idRoom;
	}

	public Room getNextRoom() {
		return nextRoom;
	}

	public void setNextRoom(Room nextRoom) {
		this.nextRoom = nextRoom;
	}

	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(){
		capacity--;
	}

	@Override
	public String toString() {
		return "Room [idRoom=" + idRoom +  ", capacity=" + capacity + "]";
	}
}