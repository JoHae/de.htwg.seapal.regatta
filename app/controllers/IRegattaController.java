package controllers;

import util.observer.IObservable;

public interface IRegattaController extends IObservable{

	void setBoatName(String string);
	
	String getBoatName();

	String getString();

}
