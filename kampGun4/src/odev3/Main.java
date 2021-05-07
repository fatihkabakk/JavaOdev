package odev3;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		GamerService gamerService = new GamerManager(new GamerCheckManager());
		GameService gameService = new GameManager();
		CampaignService campaignService = new CampaignManager();
		
		Gamer gamer = new Gamer(1, "AA", "AA", LocalDate.of(2000, 1, 1), "11111111111");
		Gamer gamer2 = new Gamer(1, "G-En", "NewGamer", LocalDate.of(2000, 1, 1), "11111111111");
		
		Game gtav = new Game(1, "GTA-V", "Rockstar Games", LocalDate.of(2013, 9, 17), 156.00);
        Game pubg = new Game(2, "PUBG", "KRAFTON, Inc.", LocalDate.of(2017, 12, 21), 87.00);
		
		Campaign winterSale = new Campaign(1, "Winter Sale!", 20);
		Campaign hotSale = new Campaign(2, "Hot Sale!", 50);
        
        gamerService.add(gamer);
		gamerService.update(0, null);
		gamerService.update(1, gamer2);
		gamerService.update(2, null);
		gamerService.update(3, null);
		
		gamerService.listGamers();
		
		gamerService.delete(gamer2);
		
		gamerService.listGamers();
		
		System.out.println("----------------------------------------");
		
		gameService.add(pubg);
		gameService.add(gtav);
		
		gameService.listGames();
		
		gameService.createOrder(pubg, gamer2);
		
		campaignService.applyCampaign(winterSale, gtav);
	
		gameService.createOrder(gtav, gamer);

		System.out.println("----------------------------------------");
		
		campaignService.add(hotSale);
		campaignService.add(winterSale);
		
		campaignService.listCampaigns();
		
		campaignService.delete(winterSale);
		
		campaignService.applyCampaign(hotSale, pubg);
		
		System.out.println(pubg.getDiscountedPrice());
		System.out.println("----------------------------------------");
		
	}

}
