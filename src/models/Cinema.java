package models;

import java.util.ArrayList;

public class Cinema {
 
	private ArrayList<Room> roomList;
	private Client clientHead;
	private Category categoryHead;
	
	public Cinema() {
		roomList = new ArrayList<>();
	}
	
	public void addClient(Client client){
		if (clientHead != null) {
			client.setNextClient(clientHead);
			clientHead = client;
		}else{
			clientHead = client;
		}
	}
	
	public void addHead(Category category){
		if (categoryHead != null) {
			Category actual = categoryHead;
			while (actual.getNextCategory() != null) {
				actual = actual.getNextCategory();
			}
			actual.setNextCategory(category);
		}else{
			categoryHead = category;
		}
	}
	
	public static Room createRoom(String name, int capacity){
		return new Room(name, capacity);
	}
	
	public void addRoom(Room room){
		roomList.add(room);
	}

	public ArrayList<Room> getRoomList() {
		return roomList;
	}

	public Category getHead() {
		return categoryHead;
	}
}
