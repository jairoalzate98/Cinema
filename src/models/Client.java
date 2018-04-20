package models;

public class Client extends Node{

	private int id;
	private static int count;
	private Client nextClient;
	private int posX;
	private int posY;
	
	public Client(int width, int height) {
		this.posX = (width / 2) - 40;
		this.posY = height - 100;
		this.id = ++count;
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosX() {
		this.posX -= 50;
	}

	public void setPosY() {
		this.posY -= 50;
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
