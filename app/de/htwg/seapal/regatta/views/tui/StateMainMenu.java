package de.htwg.seapal.regatta.views.tui;

import java.io.PrintStream;
import java.rmi.RemoteException;

import de.htwg.seapal.common.views.tui.StateContext;
import de.htwg.seapal.common.views.tui.TuiState;
import de.htwg.seapal.regatta.controllers.IRegattaController;

public class StateMainMenu implements TuiState {

	private static final String UNKNOWNCOMMAND = "Unknown Command! Please try again ...";
	private static final String MISSINGID = "Missing ID! Please try again ...";
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
		sb.append("t      - print all available boats").append("\n");
		sb.append("q      - Go back to main menu").append("\n");
		sb.append("\n");
		sb.append(">>");

		OUT.print(sb.toString());
	}

	@Override
	public boolean process(StateContext state, String line) {
		char command;
		String[] commandLine;
		commandLine = line.split(" ");

		if (commandLine[0].length() != 1) {
			OUT.println(UNKNOWNCOMMAND);
			return true;
		}

		command = commandLine[0].charAt(0);
		
		if(command != 'q' && commandLine.length != 2) {
			OUT.println(MISSINGID);
			return true;
		}

		switch (command) {

		case 'q':
			OUT.println("Quitting ...");
			return false;

		case 'a':
			try {
				controller.addRegatta(commandLine[1]);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			state.setState(new StateEditRegatta(controller, commandLine[1]));
			break;

		case 'e':
			state.setState(new StateEditRegatta(controller, commandLine[1]));
			break;
			
		case 't':
			try {
				OUT.println(controller.getBoatIdsAvailable());
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case 'p':
			printCommand(commandLine[1]);
			break;

		default:
			OUT.println(UNKNOWNCOMMAND);
			print();
		}

		return true;
	}
	
	private void printCommand(String id) {
		try {
			OUT.println(controller.getRegattaString(id));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
