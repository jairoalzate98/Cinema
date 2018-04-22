package models;

import java.util.ArrayList;
import java.util.Iterator;

public class Cinema extends Node{
 
	private ArrayList<Room> roomList;
	private Client clientList;
	private ArrayList<Client> clientListToSend;
	private ArrayList<MovieView> movieViewList;
	
	public Cinema() {
		movieViewList = new ArrayList<>();
		roomList = new ArrayList<>();
	}
	
	public static MovieView creteMovieWiew(int idClient, int idMovie){
		return new MovieView(idClient, idMovie);
	}
	
	public void verifyMove(){
		clientListToSend = new ArrayList<>(convertToArrayList());
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
					client.setNumberFinal(client.getNumber());
				}
			}
		}
	}
	
	public void getMovieViews(){
		for (Client client : convertToArrayList()) {
			if (client.getNumberFinal() != -1) {
				addMovieView(new MovieView(client.getId(), roomList.get(client.getNumber()).getIdRoom()));
			}
		}
	}
	
	public ArrayList<Client> convertToArrayList(){
		ArrayList<Client> clients = new ArrayList<>();
		Client actual = clientList;
		while (actual != null) {
			clients.add(actual);
			actual = actual.getNextClient();
		}
		return clients;
	}
	
	public ArrayList<Client> getClientListToSend() {
		return clientListToSend;
	}

	public void addMovieView(MovieView movieView){
		movieViewList.add(movieView);
	}
	
	public ArrayList<Room> getRoomList() {
		return roomList;
	}

	public void setRoomList(ArrayList<Room> roomList) {
		roomList.clear();
		this.roomList = roomList;
	}

	public Client getClientHead() {
		return clientList;
	}

	public ArrayList<MovieView> getMovieViewList() {
		return movieViewList;
	}

	public void addClient(Client client){
		if (clientList != null) {
			Client actual = clientList;
			while(actual.getNextClient() != null){
				actual = actual.getNextClient();
			}
			actual.setNextClient(client);
		}else{
			clientList = client;
		}
	}
	
	public boolean verifyCapacityInCinema(){
		boolean t = false;
		for (int i = 0; i < roomList.size(); i++) {
			if(roomList.get(i).getCapacity() != 0){
				t = true;
			}
		}
		return t;
	}
}