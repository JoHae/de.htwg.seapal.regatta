package de.htwg.seapal.regatta.database.impl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.avaje.ebean.Ebean;

import de.htwg.seapal.regatta.database.IRegattaDatabase;
import de.htwg.seapal.regatta.models.IRegatta;
import de.htwg.seapal.regatta.models.impl.Regatta;

public class RegattaEbeanDatabase implements IRegattaDatabase {

	@Override
	public void saveRegatta(IRegatta regatta) {
		if(containsRegatta(regatta.getId())) {
			Ebean.update(regatta);
		} else {
			Regatta tRegatta = new Regatta(regatta);
			Ebean.save(tRegatta);
		}
	}

	@Override
	public boolean containsRegatta(String regattaId) {
		return getRegattaById(regattaId) != null;
	}

	@Override
	public IRegatta getRegattaById(String regattaId) {
		return Ebean.find(Regatta.class, regattaId);
	}

	@Override
	public void deleteRegattaById(String regattaId) {
		Ebean.delete(Regatta.class, regattaId);
	}

	@Override
	public List<String> getAllRegattaIds() {
		List<String> regattaIds = new LinkedList<String>();
		List<Regatta> list = Ebean.find(Regatta.class).findList();
		Iterator<Regatta> it = list.iterator();
		
		while(it.hasNext()) {
			regattaIds.add(it.next().getId());
		}
		return regattaIds;
	}
}
