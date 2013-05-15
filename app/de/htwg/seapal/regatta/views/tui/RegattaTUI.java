package de.htwg.seapal.regatta.views.tui;

import java.io.PrintStream;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import de.htwg.seapal.common.views.tui.StateContext;
import de.htwg.seapal.common.views.tui.TuiState;
import de.htwg.seapal.regatta.controllers.IRegattaController;
import de.htwg.seapal.regatta.util.observer.Event;
import de.htwg.seapal.regatta.util.observer.IObserver;
import de.htwg.util.plugin.Plugin;

public class RegattaTUI implements IObserver, Plugin, StateContext {

	private IRegattaController controller;
	private static final String MISSINGID = "Missing ID! Please try again ...";
	private static final String MISSINGVALUE = "Missing value! Please try again ...";
	private static final PrintStream OUT = System.out;
	
	private TuiState currentState;

	public RegattaTUI(IRegattaController controller) throws RemoteException {
		this.currentState = new StateMainMenu(controller);
		this.controller = controller;
		controller.addObserver(this);
	}

	public void update(Event e) {
//		printTUI();
	}

	@Override
	public boolean processInputLine(String line) {
		return currentState.process(this, line);
	}
	
	@Override
	public void printTUI() {
		currentState.print();
	}

	@Override
	public String getMenuEntry() {
		return "Regatta";
	}

	@Override
	public char getMenuKey() {
		return 'r';
	}

	@Override
	public void setState(TuiState state) {
		this.currentState = state;
	}
}
