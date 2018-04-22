package models;

public class Client extends Node{

	private int id;
	private static int count;
	private Client nextClient;
	private int posX;
	private int posY;
	private int height;
	private int width;
	private boolean t;
	private int number;
	
	public Client(int width, int height) {
		this.posX = (width / 2) - 40;
		this.posY = height - 100;
		this.height = height;
		this.width = width;
		this.id = ++count;
		number = -1;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isT() {
		return t;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosX() {
		this.posX --;
	}

	public void setPosXPlus() {
		this.posX ++;
	}

	public void setPosY() {
		if (posY > height / 2) {
			this.posY--;
			t = true;
		}else{
			t = false;
		}
	}

	public Client getNextClient() {
		return nextClient;
	}

	public void setNextClient(Client nextClient) {
		this.nextClient = nextClient;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + "]";
	}
}
