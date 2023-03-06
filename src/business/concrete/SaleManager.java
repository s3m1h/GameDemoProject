package business.concrete;

import business.abstracts.SaleService;
import entities.Game;
import entities.Gamer;

public class SaleManager implements SaleService{
	@Override
	public void sales(Gamer gamer, Game game) {
		System.out.println(gamer.getKullaniciAdi() +" kullanıcıadı ile"+ game.getName()+ " oyununu satın aldiniz");
		
	}

}
