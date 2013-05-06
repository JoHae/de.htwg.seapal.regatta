package de.htwg.seapal.regatta.database;

import java.util.List;

import de.htwg.seapal.regatta.models.IRegatta;

public interface IRegattaDatabase {
	
	void saveRegatta(IRegatta regatta);
	
	boolean containsRegatta(String regattaId);
	
	IRegatta getRegattaById(String regattaId);
	
	void deleteRegattaById(String regattaId);
	
	List<String> getAllRegattaIds();
}