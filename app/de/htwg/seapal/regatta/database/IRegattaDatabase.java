package de.htwg.seapal.regatta.database;

import de.htwg.seapal.regatta.models.IRegatta;

public interface IRegattaDatabase {
	
	void saveRegatta(IRegatta regatta);
	
	boolean containsRegatta(String regattaId);
	
	IRegatta getRegattaById(String regattaId);
	
	void deleteRegattaById(String regattaId);
}
