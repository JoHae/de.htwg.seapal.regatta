package de.htwg.seapal.regatta.database.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import de.htwg.seapal.regatta.database.IRegattaDatabase;
import de.htwg.seapal.regatta.models.IRegatta;

public class RegattaHashMapDatabase implements IRegattaDatabase {

	private Map<String, IRegatta> database = new HashMap<String, IRegatta>();

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

	@Override
	public List<String> getAllRegattaIds() {
		List<String> regattaIds = new LinkedList<String>();
		
		Iterator<Entry<String, IRegatta>> it = database.entrySet().iterator();
	    while (it.hasNext()) {
	        Entry<String, IRegatta> pairs = it.next();
	        regattaIds.add(pairs.getKey());
	        it.remove(); // avoids a ConcurrentModificationException
	    }
	    
		return regattaIds;
	}
}
