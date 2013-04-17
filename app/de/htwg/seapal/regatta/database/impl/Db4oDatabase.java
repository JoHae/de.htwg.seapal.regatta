package de.htwg.seapal.regatta.database.impl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.query.Predicate;

import de.htwg.seapal.regatta.database.IRegattaDatabase;
import de.htwg.seapal.regatta.models.IRegatta;

public class Db4oDatabase implements IRegattaDatabase {
	
	private ObjectContainer db;
	
	public Db4oDatabase() {
		db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"target/regatta.data");
	}

	@Override
	public void saveRegatta(IRegatta regatta) {
		db.store(regatta);
	}

	@Override
	public boolean containsRegatta(final String regattaId) {
		if(getRegattaById(regattaId) == null) {
			return false;			
		}
		return true;
	}

	@Override
	public IRegatta getRegattaById(final String regattaId) {
		List <IRegatta> regattas = db.query(new Predicate<IRegatta>() {

			private static final long serialVersionUID = 1L;

			public boolean match(IRegatta regatta) {
			return regatta.getId() == regattaId;
			}
		});
		
		if(regattas.isEmpty()) {
			return null;			
		}
		return regattas.get(0);
	}

	@Override
	public void deleteRegattaById(String regattaId) {
		IRegatta regatta = getRegattaById(regattaId);
		if (regatta != null) {
			db.delete(regatta);
		}
	}
	
	public void closeDb() {
		db.close();
	}

	@Override
	public List<String> getAllRegattaIds() {
		List<String> regattaIds = new LinkedList<String>();
		List<IRegatta> result = db.query(IRegatta.class);
		Iterator<IRegatta> it = result.iterator();
		
		while(it.hasNext()) {
			regattaIds.add(it.next().getId());
		}
		return regattaIds;
	}
}
