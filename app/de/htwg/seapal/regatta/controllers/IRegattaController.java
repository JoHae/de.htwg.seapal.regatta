package de.htwg.seapal.regatta.controllers;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;
import java.util.Set;

import de.htwg.seapal.regatta.util.observer.IObservable;

public interface IRegattaController extends IObservable, IRemote {

	List<String> getRegattaIds() throws RemoteException;
	
	void addRegatta(String regattaId) throws RemoteException;
	void deleteRegattaById(String regattaId) throws RemoteException;
	
	void setRegattaName(String regattaId, String value) throws RemoteException;
	String getRegattaName(String regattaId) throws RemoteException;
	
	void setRegattaHost(String regattaId, String value) throws RemoteException;
	String getRegattaHost(String regattaId) throws RemoteException;
	
	void setRegattaEstimatedStartTime(String regattaId, Date date) throws RemoteException;
	Date getRegattaEstimatedStartTime(String regattaId) throws RemoteException;
	
	void setRegattaEstimatedFinishTime(String regattaId, Date date) throws RemoteException;
	Date getRegattaEstimatedFinishTime(String regattaId) throws RemoteException;
	
	void setRegattaRealStartTime(String regattaId, Date date) throws RemoteException;
	Date getRegattaRealStartTime(String regattaId) throws RemoteException;
	
	void setRegattaRealFinishTime(String regattaId, Date date) throws RemoteException;
	Date getRegattaRealFinishTime(String regattaId) throws RemoteException;

	void addBoatByRegattaId(String regattaId, String boatId) throws RemoteException;
	List<String> getBoatIdsByRegattaId(String regattaId) throws RemoteException;
	Set<String> getBoatIdsAvailable() throws RemoteException;
	
	String getRegattaString(String regattaId) throws RemoteException;
}
