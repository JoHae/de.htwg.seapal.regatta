package controllers.impl;

import com.google.inject.Inject;

import controllers.IRegattaController;
import util.observer.Observable;
import models.IRegatta;

public class RegattaController extends Observable implements IRegattaController{
	
	private IRegatta regatta;

	@Inject
	public RegattaController(IRegatta regatta) {
		this.regatta = regatta;
	}

	@Override
	public void setRegattaName(String string) {
		regatta.setName(string);
		notifyObservers();
	}

	@Override
	public String getRegattaName() {
		return regatta.getName();
	}
	
	@Override
	public void setRegattaHost(String string) {
		regatta.setHost(string);
		notifyObservers();		
	}

	@Override
	public String getRegattaHost() {
		// TODO Auto-generated method stub
		return regatta.getHost();
	}
	
	@Override
	public String getString() {
		return "RegattaName: " + regatta.getName() + "\nRegattaHost: " + regatta.getHost();
	}
}
