package de.htwg.seapal.regatta.controllers;

import java.util.Date;
import java.util.List;

import de.htwg.seapal.regatta.util.observer.IObservable;

public interface IRegattaController extends IObservable {

	List<String> getRegattaIds();
	
	void addRegatta(String regattaId);
	void deleteRegattaById(String regattaId);
	
	void setRegattaName(String regattaId, String value);
	String getRegattaName(String regattaId);
	
	void setRegattaHost(String regattaId, String value);
	String getRegattaHost(String regattaId);
	
	void setRegattaEstimatedStartTime(String regattaId, Date date);
	Date getRegattaEstimatedStartTime(String regattaId);
	
	void setRegattaEstimatedFinishTime(String regattaId, Date date);
	Date getRegattaEstimatedFinishTime(String regattaId);
	
	void setRegattaRealStartTime(String regattaId, Date date);
	Date getRegattaRealStartTime(String regattaId);
	
	void setRegattaRealFinishTime(String regattaId, Date date);
	Date getRegattaRealFinishTime(String regattaId);
	
	String getRegattaString(String regattaId);
}
