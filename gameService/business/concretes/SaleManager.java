package gameService.business.concretes;

import gameService.business.abstracts.SaleService;
import gameService.entities.concretes.Campaign;
import gameService.entities.concretes.Customer;
import gameService.entities.concretes.Game;

public class SaleManager implements SaleService {

	
	@Override
	public void sale(Customer customer, Game game, Campaign campaign) {
		int lastPrice = game.getGameUnitPrice() - (game.getGameUnitPrice()*campaign.getCampaignDicount() / 100);
		System.out.println(customer.getFirstName( ) + " adlý müþteri " + game.getGameName() + " adlý oyunu " + "%" + campaign.getCampaignDicount() + " indirimle " + lastPrice + " TL'ye satýn aldý.");
	}

}
