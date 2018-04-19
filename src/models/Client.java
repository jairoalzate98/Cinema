package models;

public class Client extends Node{

	private int id;
	private static int count;
	private Client nextClient;
	
	public Client() {
		this.id = ++count;
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
