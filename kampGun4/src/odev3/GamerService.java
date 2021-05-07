package odev3;

public interface GamerService {
	
	void add(Gamer gamer);
	void delete(Gamer gamer);
	void update(int id, Gamer gamer);
	void listGamers();
}
