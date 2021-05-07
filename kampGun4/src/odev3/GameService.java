package odev3;

public interface GameService {
	void add(Game game);
	void delete(Game game);
	void update(int id, Game game);
	void listGames();
	void createOrder(Game game, Gamer gamer);
}
