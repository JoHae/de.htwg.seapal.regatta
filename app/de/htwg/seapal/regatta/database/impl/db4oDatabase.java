package de.htwg.seapal.regatta.database.impl;

import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.query.Predicate;

import de.htwg.seapal.regatta.database.IRegattaDatabase;
import de.htwg.seapal.regatta.models.IRegatta;

public class db4oDatabase implements IRegattaDatabase {
	
	ObjectContainer db;
	
	public db4oDatabase() {
		db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"regatta.data");
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
		} else if(regattas.size() > 1) {
			// TODO Handle it in here ?
		}
		return regattas.get(0);
	}

	@Override
	public void deleteRegattaById(String regattaId) {
		db.delete(getRegattaById(regattaId));
	}
	
	public void closeDb() {
		db.close();
	}
}
