package gameService.business.abstracts;

import gameService.entities.concretes.Campaign;
import gameService.entities.concretes.Customer;
import gameService.entities.concretes.Game;

public interface SaleService {
	void sale(Customer customer, Game game, Campaign campaign);
}
