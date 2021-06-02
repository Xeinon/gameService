package gameService.entities.concretes;

import gameService.entities.abstracts.Entity;

public class Game implements Entity {

	private int gameId;
	private String gameName;
	private int gameUnitPrice;
	
	public Game(int gameId, String gameName, int gameUnitPrice) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.gameUnitPrice = gameUnitPrice;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getGameUnitPrice() {
		return gameUnitPrice;
	}

	public void setGameUnitPrice(int gameUnitPrice) {
		this.gameUnitPrice = gameUnitPrice;
	}

	
}
