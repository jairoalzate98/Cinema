package models;

import java.util.ArrayList;

public class Cinema {
 
	private ArrayList<Room> roomList;
	private Client clientHead;
	private Movie movieHead;
	private ArrayList<MovieView> movieViewList;
	private int number;
	
	public Cinema() {
		movieViewList = new ArrayList<>();
		roomList = new ArrayList<>();
		number = -1;
	}
	
	public static MovieView creteMovieWiew(int idClient, int idMovie){
		return new MovieView(idClient, idMovie);
	}
	
	public void verifyMove(){
		clientHead.setPosY();
		if (!clientHead.isT()) {
			if (number == -1) {
				number = (int)(Math.random()*(roomList.size()));
				System.out.println(number);
			}
			int posX = roomList.get(number).getPosX();
			if (posX > clientHead.getPosX()) {
				clientHead.setPosXPlus();
			}else if(posX < clientHead.getPosX()){
				clientHead.setPosX();
			}else{ 
				return;
			}
		}
	}
	
	public void addMovieView(MovieView movieView){
		movieViewList.add(movieView);
	}
	
	public Movie getMovieHead(){
		return movieHead;
	}
	
	public ArrayList<Room> getRoomList() {
		return roomList;
	}

	public void setRoomList(ArrayList<Room> roomList) {
		this.roomList = roomList;
	}

	public Client getClientHead() {
		return clientHead;
	}

	public ArrayList<MovieView> getMovieViewList() {
		return movieViewList;
	}

	public void addClient(Client client){
		if (clientHead != null) {
			client.setNextClient(clientHead);
			clientHead = client;
		}else{
			clientHead = client;
		}
	}
	
	public void addMovie(Movie movie){
		if (movieHead != null) {
			Movie actual = movieHead;
			while(actual.getNextMovie() != null){
				actual = actual.getNextMovie();
			}
			actual.setNextMovie(movie);
		}else{
			movieHead = movie;
		}
	}
}