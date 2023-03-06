package business.abstracts;

import entities.Gamer;

public interface GamerService {
	public void kaydol(Gamer gamer) throws Exception;
	public void guncelle(int id);
	public void kayitSil(int id);
}
