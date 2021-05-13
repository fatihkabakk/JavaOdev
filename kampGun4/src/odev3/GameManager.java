package odev3;

import java.util.ArrayList;
import java.util.List;

public class GameManager implements GameService {

	private List<Game> gameList = new ArrayList<Game>();
	
	@Override
	public void add(Game game) {
		gameList.add(game);
		System.out.println(game.getName() + " adlı oyun sisteme kaydedildi!");
		
	}

	@Override
	public void delete(Game game) {
		if (gameList.contains(game)) {
			gameList.remove(game);
			System.out.println(game.getName() + " adlı oyun sistemden silindi!");
		} else {
			System.out.println("Böyle bir oyun mevcut değil!");
		}
	}

	@Override
	public void update(int id, Game game) {
		Game gameToUpdate = null;
		
		for (Game loopGame : gameList) {
			if (loopGame.getId() == id) {
				gameToUpdate = loopGame;
				break;
			}
		}
		if (gameList.contains(gameToUpdate)) {
			gameList.remove(gameToUpdate);
			gameList.add(game);
			System.out.println(gameToUpdate.getName() + " --> " + game.getName() + " olarak güncellendi!");
		} else {
			System.out.println("Böyle bir oyun mevcut değil!");
		}
	}

	@Override
	public void listGames() {
		for (Game game : gameList) {
			System.out.println(game.getName() + " " + game.getDeveloper() + " " + game.getReleaseDate() + " " + game.getUnitPrice() + " TL/" + game.getDiscountedPrice() + " TL %" + game.getDiscountRate());
		}
	}

	@Override
	public void createOrder(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " adlı kullanıcı " + game.getName() + " adlı oyunu " + game.getDiscountedPrice() + " TL karşılığında satın aldı");
		
	}

}
