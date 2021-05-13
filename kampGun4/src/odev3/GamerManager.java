package odev3;

import java.util.ArrayList;
import java.util.List;

public class GamerManager implements GamerService {
	
	private List<Gamer> gamerList = new ArrayList<Gamer>();
	
	private GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if (gamerCheckService.checkIfRealPerson(gamer)) {
			gamerList.add(gamer);
			System.out.println(gamer.getFirstName() + " kaydedildi!");
		} else {
			System.out.println("Kullanýcý bilgileri geçersiz!");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		if (gamerList.contains(gamer)) {
			gamerList.remove(gamer);
			System.out.println(gamer.getFirstName() + " silindi!");
		} else {
			System.out.println("Böyle bir kullanýcý mevcut deðil!");
		}
		
	}

	@Override
	public void update(int id, Gamer gamer) {
		Gamer gamerToUpdate = null;
		
		for (Gamer loopGamer : gamerList) {
			if (loopGamer.getId() == id) {
				gamerToUpdate = loopGamer;
				break;
			}
		}
		if (gamerList.contains(gamerToUpdate)) {
			gamerList.remove(gamerToUpdate);
			gamerList.add(gamer);
			System.out.println(gamerToUpdate.getFirstName() + " --> " + gamer.getFirstName() + " olarak güncellendi!");
		} else {
			System.out.println("Böyle bir kullanýcý mevcut deðil!");
		}
		
		
	}
	
	public void listGamers() {
		for (Gamer gamer : gamerList) {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " " + gamer.getDateofBirth() + " " + gamer.getNationalityId());
		}
	}

}
