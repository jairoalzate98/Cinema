package models;

public class Room extends Node {

	private int idRoom;
	private static int count;
	private int capacity;
	private Room nextRoom;
	
	public Room() {
		this.idRoom = ++count;
		capacity = (int) (Math.random()*30);
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

	@Override
	public String toString() {
		return "Room [idRoom=" + idRoom +  ", capacity=" + capacity + "]";
	}
}