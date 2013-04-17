package de.htwg.seapal.regatta.database.mock;

import java.util.List;

import de.htwg.seapal.regatta.database.IRegattaDatabase;
import de.htwg.seapal.regatta.models.IRegatta;
import de.htwg.seapal.regatta.models.mock.Regatta;

public class RegattaHashMapDatabase implements IRegattaDatabase {

	@Override
	public void saveRegatta(IRegatta regatta) {}

	@Override
	public boolean containsRegatta(String regattaId) {
		return true;
	}

	@Override
	public IRegatta getRegattaById(String regattaId) {
		return new Regatta();
	}

	@Override
	public void deleteRegattaById(String regattaId) {}

	@Override
	public List<String> getAllRegattaIds() {
		// TODO Auto-generated method stub
		return null;
	}
}
