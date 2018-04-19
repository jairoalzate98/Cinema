package models;

public class MovieView extends Node{

	private int idClient;
	private int idMovie;
	
	public MovieView(int idClient, int idMovie) {
		this.idClient = idClient;
		this.idMovie = idMovie;
	}

	public int getIdClient() {
		return idClient;
	}

	public int getIdMovie() {
		return idMovie;
	}

	@Override
	public String toString() {
		return "MovieView [idClient=" + idClient + ", idMovie=" + idMovie + "]";
	}
}
