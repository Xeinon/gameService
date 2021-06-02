package gameService.business.abstracts;
import gameService.entities.concretes.Campaign;


public interface CampaignService {
	void add(Campaign campaign);
	void delete(Campaign campaign);
	void update(Campaign campaign);
}
