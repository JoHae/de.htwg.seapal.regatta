package controllers.impl;

import com.google.inject.Inject;

import controllers.IRegattaController;
import util.observer.Observable;
import models.IRegatta;

public class RegattaController extends Observable implements IRegattaController{
	
	private IRegatta boat;

	@Inject
	public RegattaController(IRegatta boat) {
		this.boat = boat;
	}

	@Override
	public void setBoatName(String string) {
		boat.setName(string);
		notifyObservers();
	}
	
	@Override
	public String getString() {
		return "Boat: " + boat.getName();
	}

	@Override
	public String getBoatName() {
		return boat.getName();
	}

}
