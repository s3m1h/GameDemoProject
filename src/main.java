import business.abstracts.SaleService;
import business.adapters.MernisServiceAdapter;
import business.concrete.GamerManager;
import business.concrete.SaleManager;
import dataAccess.concrete.InMemoryGamerRepository;
import entities.Game;
import entities.Gamer;

public class main {

	public static void main(String[] args) throws Exception {
		Gamer gamer = new Gamer(1,"smhacar","semih","acar","1996","16177193926");
		Game game = new Game(0, "csgo", 1000);
		
		GamerManager gamerManager = 
				new GamerManager(new InMemoryGamerRepository(), new MernisServiceAdapter());
		gamerManager.kaydol(gamer);
	
		SaleManager saleManager = new SaleManager();
		saleManager.sales(gamer, game);
	}

}
