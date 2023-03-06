package business.concrete;

import business.abstracts.GamerCheckService;
import business.abstracts.GamerService;
import dataAccess.abstracts.GamerRepository;
import entities.Gamer;

public class GamerManager implements GamerService{
	private GamerRepository gamerRepository;
	private GamerCheckService gamerCheckService;
	public GamerManager(GamerRepository gamerRepository,GamerCheckService gamerCheckService) {
		super();
		this.gamerRepository = gamerRepository;
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void kaydol(Gamer gamer) throws Exception {
		if(gamerCheckService.checkIfRealGamer(gamer)) {
			gamerRepository.add(gamer);
			System.out.println("gamer eklendi");
		}
		else {
			throw new Exception("gamer bulunamadı.");
		}
	}

	@Override
	public void guncelle(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kayitSil(int id) {
		// TODO Auto-generated method stub
		
	}
}
