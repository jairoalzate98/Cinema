package models;

import java.util.ArrayList;

public class Category {

	private int idCategory;
	private static int count;
	private String nameCategory;
	private Category nextCategory;
	private ArrayList<Movie> movieList;
	
	public Category(String nameCategory) {
		this.idCategory = ++count;
		this.nameCategory = nameCategory;
	}
	
	public Category getNextCategory() {
		return nextCategory;
	}

	public void setNextCategory(Category nextCategory) {
		this.nextCategory = nextCategory;
	}

	public static Movie createMovie(String nameMovie, Category category){
		return new Movie(nameMovie, category);
	}
	
	public void addMovie(Movie movie){
		movieList.add(movie);
	}

	public int getIdCategory() {
		return idCategory;
	}

	public String getNameCategory() {
		return nameCategory;
	}

	@Override
	public String toString() {
		return "Category [idCategory=" + idCategory + ", nameCategory=" + nameCategory + "]";
	}
}