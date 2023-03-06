package dataAccess.concrete;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.GamerRepository;
import entities.Gamer;

public class InMemoryGamerRepository implements GamerRepository{
	
	List<Gamer> gamers;
	public InMemoryGamerRepository() {
		this.gamers = new ArrayList<Gamer>();
		
	}
	@Override
	public void add(Gamer gamer) {
		this.gamers.add(gamer);
		
	}

	
	
}
