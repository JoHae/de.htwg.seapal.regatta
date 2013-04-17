package de.htwg.seapal.regatta.controllers;

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

	String getRegattaString(String regattaId);
}
