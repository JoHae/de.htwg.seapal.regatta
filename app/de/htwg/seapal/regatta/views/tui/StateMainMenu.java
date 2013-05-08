package de.htwg.seapal.regatta.views.tui;

import java.io.PrintStream;
import java.util.Scanner;

import de.htwg.seapal.common.views.tui.StateContext;
import de.htwg.seapal.common.views.tui.TuiState;
import de.htwg.seapal.regatta.controllers.IRegattaController;

public class StateMainMenu implements TuiState {

	private static final String UNKNOWNCOMMAND = "Unknown Command! Please try again ...";
	private static final String MISSINGID = "Missing ID! Please try again ...";
	private static final String MISSINGVALUE = "Missing value! Please try again ...";
	private static final PrintStream OUT = System.out;
	private final IRegattaController controller;

	public StateMainMenu(IRegattaController controller) {
		this.controller = controller;
	}
	
	@Override
	public void print() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		sb.append("RegattaDemo: ").append("\n");
		sb.append("a <ID> - add Regatta with specified ID").append("\n");
		sb.append("e <ID> - edit Regatta with specified ID").append("\n");
		sb.append("p <ID> - print values of Regatta with specified ID").append(
				"\n");
		sb.append("q      - Go back to main menu").append("\n");
		sb.append("\n");
		sb.append(">>");

		OUT.print(sb.toString());
	}

	@Override
	public boolean process(StateContext state, String line) {

		boolean continu = true;

		char command;
		String[] commandLine;
		commandLine = line.split(" ");

		if (commandLine[0].length() != 1) {
			OUT.println(UNKNOWNCOMMAND);
			print();
			return continu;
		}

		command = commandLine[0].charAt(0);
		
		if(command != 'q' && commandLine.length != 2) {
			OUT.println(MISSINGID);
			print();
			return continu;
		}

		switch (command) {

		case 'q':
			continu = false;
			OUT.println("Quitting ...");
			break;

		case 'a':
			controller.addRegatta(commandLine[1]);
			state.setState(new StateEditRegatta(commandLine[1]));
			break;

		case 'e':
			editRegattaCommand(scanner);
			break;
			
		case 'p':
			printRegattaCommand(scanner);
			break;

		default:
			OUT.println(UNKNOWNCOMMAND);
			print();
		}

		return continu;

		return false;
	}
	

}
