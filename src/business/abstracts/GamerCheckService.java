package business.abstracts;

import entities.Gamer;

public interface GamerCheckService {
	public boolean checkIfRealGamer(Gamer gamer) throws Exception;
}
