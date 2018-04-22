package models;

import java.util.ArrayList;
import java.util.Iterator;

public class Cinema {
 
	private ArrayList<Room> roomList;
	private ArrayList<Client> clientList;
	private ArrayList<Client> clientListToSend;
	private Movie movieHead;
	private ArrayList<MovieView> movieViewList;
	
	public Cinema() {
		movieViewList = new ArrayList<>();
		roomList = new ArrayList<>();
		clientList = new ArrayList<>();
	}
	
	public static MovieView creteMovieWiew(int idClient, int idMovie){
		return new MovieView(idClient, idMovie);
	}
	
	public void verifyMove(){
		/*
		 * Iterator<String> iter = myArrayList.iterator();

while (iter.hasNext()) {
    String str = iter.next();

    if (someCondition)
        iter.remove();
}
		 * */
		clientListToSend = new ArrayList<>(clientList);
		Iterator<Client> iter = clientListToSend.iterator();
		while(iter.hasNext()){
			Client client = iter.next();
			client.setPosY();
			if (!client.isT()) {
				if (client.getNumber() == -1) {
					client.setNumber((int)(Math.random()*(roomList.size())));
				}
				int posX = roomList.get(client.getNumber()).getPosX();
				if (posX > client.getPosX()) {
					client.setPosXPlus();
				}else if(posX < client.getPosX()){
					client.setPosX();
				}else{ 
					iter.remove();
				}
			}
		}
	}
	
	public ArrayList<Client> getClientListToSend() {
		return clientListToSend;
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

	public ArrayList<Client> getClientHead() {
		return clientList;
	}

	public ArrayList<MovieView> getMovieViewList() {
		return movieViewList;
	}

	public void addClient(Client client){
		clientList.add(client);
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