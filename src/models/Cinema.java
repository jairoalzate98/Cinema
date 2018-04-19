package models;

import java.util.ArrayList;

public class Cinema {
 
	private Room roomHead;
	private Client clientHead;
	private Movie movieHead;
	private ArrayList<MovieView> movieViewList;
	
	public Cinema() {
		movieViewList = new ArrayList<>();
	}
	
	public static MovieView creteMovieWiew(int idClient, int idMovie){
		return new MovieView(idClient, idMovie);
	}
	
	public void addMovieView(MovieView movieView){
		movieViewList.add(movieView);
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
	
	public void addRoom(Room room){
		if (roomHead != null) {
			Room actual = roomHead;
			while(actual.getNextRoom() != null){
				actual = actual.getNextRoom();
			}
			actual.setNextRoom(room);
		}else{
			roomHead = room;
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