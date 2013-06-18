package de.htwg.seapal.regatta.controllers.impl;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import de.htwg.seapal.boat.controllers.IBoatController;
import de.htwg.seapal.regatta.controllers.IRegattaController;
import de.htwg.seapal.regatta.database.IRegattaDatabase;
import de.htwg.seapal.regatta.models.IRegatta;
import de.htwg.seapal.regatta.models.impl.Regatta;
import de.htwg.seapal.common.observer.Observable;

@Singleton
public class RegattaController extends Observable implements IRegattaController {

	@Inject
	private IRegattaDatabase database;

	@Inject
	private IBoatController boatController;

	public RegattaController() throws RemoteException {
//		Registry registry;
//			registry = LocateRegistry.getRegistry();
//			try {
//				boatController = (IBoatController) registry.lookup("BoatControllerRMI");
//			} catch (NotBoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
	}

	@Override
	public void addRegatta(String regattaId) throws RemoteException {
		IRegatta regatta = new Regatta();
		regatta.setId(regattaId);
		if(database.containsRegatta(regattaId)) {
			throw new IllegalArgumentException();
		}
		database.saveRegatta(regatta);
		notifyObservers();
	}

	@Override
	public void deleteRegattaById(String regattaId) throws RemoteException {
		database.deleteRegattaById(regattaId);
		notifyObservers();
	}

	@Override
	public void setRegattaName(String regattaId, String value) throws RemoteException {
		if (database.containsRegatta(regattaId)) {
			IRegatta regatta = database.getRegattaById(regattaId);
			regatta.setName(value);
			database.saveRegatta(regatta);
		}
		notifyObservers();
	}

	@Override
	public String getRegattaName(String regattaId) throws RemoteException {
		if (database.containsRegatta(regattaId)) {
			return database.getRegattaById(regattaId).getName();
		} else {
			return null;
		}
	}

	@Override
	public void setRegattaHost(String regattaId, String value) throws RemoteException {
		if (database.containsRegatta(regattaId)) {
			IRegatta regatta = database.getRegattaById(regattaId);
			regatta.setHost(value);
			database.saveRegatta(regatta);
		}
		notifyObservers();
	}

	@Override
	public String getRegattaHost(String regattaId) throws RemoteException {
		if (database.containsRegatta(regattaId)) {
			return database.getRegattaById(regattaId).getHost();
		} else {
			return null;
		}
	}

	@Override
	public String getRegattaString(String regattaId) throws RemoteException {
		if (database.containsRegatta(regattaId)) {
			return database.getRegattaById(regattaId).getString();
		} else {
			return null;
		}
	}
	@Override
	public void setRegattaEstimatedStartTime(String regattaId, Date date)  throws RemoteException {
		if (database.containsRegatta(regattaId)) {
			IRegatta regatta = database.getRegattaById(regattaId);
			regatta.setEstimatedStartTime(date);
			database.saveRegatta(regatta);
		}
		notifyObservers();
	}

	@Override
	public Date getRegattaEstimatedStartTime(String regattaId) throws RemoteException{
		if(database.containsRegatta(regattaId)) {
			return database.getRegattaById(regattaId).getEstimatedStartTime();
		} else {
			return null;
		}
	}

	@Override
	public void setRegattaEstimatedFinishTime(String regattaId, Date date) throws RemoteException {
		if (database.containsRegatta(regattaId)) {
			IRegatta regatta = database.getRegattaById(regattaId);
			regatta.setEstimatedFinishTime(date);
			database.saveRegatta(regatta);
		}
		notifyObservers();

	}

	@Override
	public Date getRegattaEstimatedFinishTime(String regattaId) throws RemoteException {
		if(database.containsRegatta(regattaId)) {
			return database.getRegattaById(regattaId).getEstimatedFinishTime();
		} else  {
			return null;
		}
	}

	@Override
	public void setRegattaRealStartTime(String regattaId, Date date) throws RemoteException {
		if (database.containsRegatta(regattaId)) {
			IRegatta regatta = database.getRegattaById(regattaId);
			regatta.setRealStartTime(date);
			database.saveRegatta(regatta);
		}
		notifyObservers();

	}

	@Override
	public Date getRegattaRealStartTime(String regattaId) throws RemoteException {
		if (database.containsRegatta(regattaId)) {
			return database.getRegattaById(regattaId).getRealStartTime();
		} else {
			return null;
		}
	}

	@Override
	public void setRegattaRealFinishTime(String regattaId, Date date) throws RemoteException {
		if (database.containsRegatta(regattaId)) {
			IRegatta regatta = database.getRegattaById(regattaId);
			regatta.setRealFinishTime(date);
			database.saveRegatta(regatta);
		}
		notifyObservers();
	}

	@Override
	public Date getRegattaRealFinishTime(String regattaId) throws RemoteException {
		if (database.containsRegatta(regattaId)) {
			return database.getRegattaById(regattaId).getRealFinishTime();
		} else {
			return null;
		}
	}

	@Override
	public List<String> getRegattaIds() throws RemoteException {
		return database.getAllRegattaIds();
	}

	@Override
	public void addBoatByRegattaId(String regattaId, String boatId)
			throws RemoteException {
		if (database.containsRegatta(regattaId)) {
			IRegatta regatta = database.getRegattaById(regattaId);
			regatta.addBoat(boatId);
			database.saveRegatta(regatta);
		}
		notifyObservers();
	}

	@Override
	public List<String> getBoatIdsByRegattaId(String regattaId)
			throws RemoteException {
		return database.getRegattaById(regattaId).getBoatIds();
	}

	@Override
	public Set<String> getBoatIdsAvailable() throws RemoteException {
		Map<String,String> boats = boatController.getBoats();
		return boats.keySet();		
	}
}
