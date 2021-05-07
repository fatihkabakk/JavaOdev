package odev3;

public interface CampaignService {
	void add(Campaign campaign);
	void delete(Campaign campaign);
	void update(int id, Campaign campaign);
	void applyCampaign(Campaign campaign, Game game);
	void listCampaigns();
}
