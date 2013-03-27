package controllers;

import util.observer.IObservable;

public interface IRegattaController extends IObservable{

	void setRegattaName(String string);
	String getRegattaName();
	
	void setRegattaHost(String string);
	String getRegattaHost();

	String getString();

}
