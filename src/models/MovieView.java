package models;

public class MovieView extends Node{

	private int idClient;
	private int idRoom;
	
	public MovieView(int idClient, int idRoom) {
		this.idClient = idClient;
		this.idRoom = idRoom;
	}

	public int getIdClient() {
		return idClient;
	}

	public int getIdRoom() {
		return idRoom;
	}

	@Override
	public String toString() {
		return "MovieView [idClient=" + idClient + ", idRoom=" + idRoom + "]";
	}
	
	public Object[] toArray(){
		return new Object[]{idClient, idRoom};
	}
}
