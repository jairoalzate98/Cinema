package models;

public class Room {

	private int idRoom;
	private static int count;
	private String name;
	private int capacity;
	
	public Room(String name, int capacity) {
		this.idRoom = ++count;
		this.name = name;
		this.capacity = capacity;
	}

	public int getIdRoom() {
		return idRoom;
	}

	public String getName() {
		return name;
	}

	public int getCapacity() {
		return capacity;
	}

	@Override
	public String toString() {
		return "Room [idRoom=" + idRoom + ", name=" + name + ", capacity=" + capacity + "]";
	}
}