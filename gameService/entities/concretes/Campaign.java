package gameService.entities.concretes;

import gameService.entities.abstracts.Entity;

public class Campaign implements Entity{
	
	private int campaignId;
	private String campaignName;
	private int campaignDicount;
	
	public Campaign(int campaignId, String campaignName, int campaignDicount) {
		super();
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.campaignDicount = campaignDicount;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getCampaignDicount() {
		return campaignDicount;
	}

	public void setCampaignDicount(int campaignDicount) {
		this.campaignDicount = campaignDicount;
	}

	
	
}
