package de.htwg.seapal.regatta.controllers.impl;

import java.util.List;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import de.htwg.seapal.boat.controllers.IBoatController;
import de.htwg.seapal.regatta.controllers.IRegattaController;
import de.htwg.seapal.regatta.database.IRegattaDatabase;
import de.htwg.seapal.regatta.database.impl.RegattaHashMapDatabase;
import de.htwg.seapal.regatta.models.IRegatta;
import de.htwg.seapal.regatta.models.impl.Regatta;
import de.htwg.seapal.regatta.util.observer.Observable;

@Singleton
public class RegattaController extends Observable implements IRegattaController {
	
	private IRegattaDatabase database;
	
	@Inject
	public RegattaController(IBoatController boatController) {
		database = new RegattaHashMapDatabase();
	}
	
	@Override
	public void addRegatta(String regattaId) {
		IRegatta regatta = new Regatta();
		regatta.setId(regattaId);
		if(database.containsRegatta(regattaId)) {
			throw new IllegalArgumentException();
		}
		database.saveRegatta(regatta);
		notifyObservers();
	}
	
	@Override
	public void deleteRegattaById(String regattaId) {
		database.deleteRegattaById(regattaId);
		notifyObservers();
	}

	@Override
	public void setRegattaName(String regattaId, String value) {
		if (database.containsRegatta(regattaId)) {
			IRegatta regatta = database.getRegattaById(regattaId);
			regatta.setName(value);
			database.saveRegatta(regatta);
		}
		notifyObservers();
	}

	@Override
	public String getRegattaName(String regattaId) {
		if (database.containsRegatta(regattaId)) {
			return database.getRegattaById(regattaId).getName();
		} else {
			return null;
		}
	}

	@Override
	public void setRegattaHost(String regattaId, String value) {
		if (database.containsRegatta(regattaId)) {
			IRegatta regatta = database.getRegattaById(regattaId);
			regatta.setHost(value);
			database.saveRegatta(regatta);
		}
		notifyObservers();
	}

	@Override
	public String getRegattaHost(String regattaId) {
		if (database.containsRegatta(regattaId)) {
			return database.getRegattaById(regattaId).getHost();
		} else {
			return null;
		}
	}

	@Override
	public String getRegattaString(String regattaId) {
		if (database.containsRegatta(regattaId)) {
			return database.getRegattaById(regattaId).getString();
		} else {
			return null;
		}
	}

	@Override
	public List<String> getRegattaIds() {
		return database.getAllRegattaIds();
	}
}
