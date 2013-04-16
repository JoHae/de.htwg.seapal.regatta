package de.htwg.seapal.regatta.database.impl;

import java.util.HashMap;

import de.htwg.seapal.regatta.database.IRegattaDatabase;
import de.htwg.seapal.regatta.models.IRegatta;

public class RegattaHashMapDatabase implements IRegattaDatabase {

	private HashMap<String, IRegatta> database = new HashMap<String, IRegatta>();

	@Override
	public void saveRegatta(IRegatta regatta) {
		database.put(regatta.getId(), regatta);
	}

	@Override
	public boolean containsRegatta(String regattaId) {
		return database.containsKey(regattaId);
	}

	@Override
	public IRegatta getRegattaById(String regattaId) {
		return database.get(regattaId);
	}

	@Override
	public void deleteRegattaById(String regattaId) {
		database.remove(regattaId);
	}
}
