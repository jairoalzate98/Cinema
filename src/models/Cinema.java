package models;

import java.util.ArrayList;

public class Cinema {
 
	private ArrayList<Room> roomList;
	
	
	public Cinema() {
		roomList = new ArrayList<>();
	}
	
	public static Room createRoom(String name, int capacity){
		return new Room(name, capacity);
	}
	
	public void addRoom(Room room){
		roomList.add(room);
	}
}
