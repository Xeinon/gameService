package gameService.entities.concretes;

import gameService.entities.abstracts.Entity;

public class Sale implements Entity{
	private int id;
	private int customerId;
	private int gameId;
	
	public Sale(int id, int customerId, int gameId) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.gameId = gameId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	
}
