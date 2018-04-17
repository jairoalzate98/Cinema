package models;

public class Category {

	private int idCategory;
	private static int count;
	private String nameCategory;
	
	public Category(String nameCategory) {
		this.idCategory = ++count;
		this.nameCategory = nameCategory;
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
