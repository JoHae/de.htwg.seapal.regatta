package de.htwg.seapal.regatta.controllers;

import java.util.Map;

import de.htwg.seapal.regatta.util.observer.IObservable;

public interface IRegattaController extends IObservable {

	Map<String,String> getRegattaList();
	
	void addRegatta(String regattaId);
	
	void setRegattaName(String regattaId, String value);
	String getRegattaName(String regattaId);
	
	void setRegattaHost(String regattaId, String value);
	String getRegattaHost(String regattaId);

	String getRegattaString(String regattaId);
}
