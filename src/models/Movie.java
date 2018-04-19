package models;

public class Movie {

	private int id;
	private static int count;
	private String nameMovie;
	private Category category;
	private Movie nextMovie;
	
	public Movie(String nameMovie, Category category) {
		this.id = ++count;
		this.nameMovie = nameMovie;
		this.category = category;
	}
	public Movie getNextMovie() {
		return nextMovie;
	}
	public void setNextMovie(Movie nextMovie) {
		this.nextMovie = nextMovie;
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