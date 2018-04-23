package models;

import java.util.ArrayList;

public class MovieView{

	private int idClient;
	private int idRoom;
	private int number;
	private ArrayList<MovieView> movieViews;

	public MovieView(int number){
		movieViews = new ArrayList<>();
		this.idRoom = number;
	}
	
	public int getNumber() {
		return number;
	}

	public void add(MovieView movieView){
		movieViews.add(movieView);
	}
	
	public ArrayList<MovieView> getMovieViews() {
		return movieViews;
	}

	public MovieView(int idClient, int idRoom) {
		this.idClient = idClient;
		this.idRoom = idRoom;
		movieViews = new ArrayList<>();
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
	
	public String toStringFolder(){
		return "Room => " + idRoom;
	}
	
	public String toStringChild(){
		return "Client => " + idClient;
	}
}
