package odev3;

import java.util.ArrayList;
import java.util.List;

public class CampaignManager implements CampaignService {

	private List<Campaign> campaignList = new ArrayList<Campaign>();
	
	@Override
	public void add(Campaign campaign) {
		campaignList.add(campaign);
		System.out.println(campaign.getName() + " sisteme eklendi!");
		
	}

	@Override
	public void delete(Campaign campaign) {
		if (campaignList.contains(campaign)) {
			campaignList.remove(campaign);
			System.out.println(campaign.getName() + " sistemden silindi!");
		} else {
			System.out.println("B�yle bir kampanya mevcut de�il!");
		}
		
	}

	@Override
	public void update(int id, Campaign campaign) {
		Campaign campaignToUpdate = null;
		
		for (Campaign loopCampaign : campaignList) {
			if (loopCampaign.getId() == id) {
				campaignToUpdate = loopCampaign;
				break;
			}
		}
		if (campaignList.contains(campaignToUpdate)) {
			campaignList.remove(campaignToUpdate);
			campaignList.add(campaign);
			System.out.println(campaignToUpdate.getName() + " --> " + campaign.getName() + " olarak g�ncellendi!");
		} else {
			System.out.println("B�yle bir kampanya mevcut de�il!");
		}
		
	}

	@Override
	public void applyCampaign(Campaign campaign, Game game) {
		game.setDiscountRate(campaign.getDiscountRate());
		System.out.println(game.getName() + " adl� oyuna %" + campaign.getDiscountRate() + " oran�nda indirim uyguland�!");
	}

	@Override
	public void listCampaigns() {
		// TODO Auto-generated method stub
		
	}

}
