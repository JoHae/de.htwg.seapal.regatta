package de.htwg.seapal.regatta.database.impl;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.ektorp.*;
import org.ektorp.ViewResult.Row;
import org.ektorp.impl.*;
import org.ektorp.http.*;

import de.htwg.seapal.regatta.database.IRegattaDatabase;
import de.htwg.seapal.regatta.models.IRegatta;
import de.htwg.seapal.regatta.models.impl.Regatta;

public class RegattaCouchDatabase implements IRegattaDatabase {

	private CouchDbConnector db;

	public RegattaCouchDatabase() {
		try {
			HttpClient client = new StdHttpClient.Builder()
			.url("http://lenny2.in.htwg-konstanz.de:5984")
			.build();
			CouchDbInstance dbInstance = new StdCouchDbInstance(client);
			db = dbInstance.createConnector("regatta_db", true);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void saveRegatta(IRegatta regatta) {
		db.create(regatta);

	}

	@Override
	public boolean containsRegatta(String regattaId) {
		if(db.get(Regatta.class, regattaId) == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public IRegatta getRegattaById(String regattaId) {
		return db.get(Regatta.class, regattaId);
	}

	@Override
	public void deleteRegattaById(String regattaId) {
		db.delete(regattaId);

	}

	@Override
	public List<String> getAllRegattaIds() {
		List<String> lst = new ArrayList<String>();
		ViewQuery query = new ViewQuery().allDocs();		
		ViewResult vr = db.queryView(query);
		
		for(Row r : vr.getRows()) {
			lst.add(r.getId());
		}
		return lst;
	}

}
