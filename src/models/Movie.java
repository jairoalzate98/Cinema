package models;

public class Movie {

	private int id;
	private static int count;
	private String nameMovie;
	private Category category;
	
	public Movie(String nameMovie, Category category) {
		this.id = ++count;
		this.nameMovie = nameMovie;
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public String getNameMovie() {
		return nameMovie;
	}
	public Category getCategory() {
		return category;
	}
}